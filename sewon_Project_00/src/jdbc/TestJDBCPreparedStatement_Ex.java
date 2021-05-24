package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCPreparedStatement_Ex {
	public static void main(String[] args) {
		if(args.length < 3) {
			System.out.println("아규먼트를 입력하고 실행하세요");
			System.exit(0);
		}
		
//update employees set email = 'muse9312@naver.com', salary = 8700, commission_pct 
//		= 0.8 where employee_id = 300;
		
		// email
		String email = args[0];
		//salary String -> float 변환
		int salary = Integer.parseInt(args[1]);
		//commission String -> int 변환
		float commission_pct = Float.parseFloat(args[2]);
		
		int empID = Integer.parseInt(args[3]);
		
		
	
		updateEmp(email,salary,commission_pct,empID);
		
	}//main

	private static void updateEmp(String Email,int sal,float co,int empID) {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver Loading 성공");
		} catch (ClassNotFoundException e) {
			System.err.println("에러 메시지 " + e.getMessage());
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		
		Connection connection = null;
		PreparedStatement statement = null;
		PreparedStatement statement2 = null;
		try {
			//2. Connection(DB와 연결) 객체생성
			connection = DriverManager.getConnection(url, user, password);
			System.out.println(connection.getClass().getName());
			
			
//update employees set email = 'muse9312@naver.com', salary = 8700, commission_pct 
//			= 0.8 where employee_id = 300;
			
			//3. Statement(SQL문 전송) 객체생성
			StringBuilder builder = new StringBuilder();
			builder.append("update employees set email =?,")
				   .append("salary =?,")
				   .append("commission_pct=?")
				   .append(" where employee_id = ?");
			
			
			
			String sql = builder.toString();
			System.out.println("update Employees => " + sql);
			
			//String sql2 = "DELETE from employees where employee_id =?";
			
			//PreparedStatement를 생성
			statement = connection.prepareStatement(sql);
		
			statement.setString(1, Email);
			statement.setInt(2, sal);
			statement.setFloat(3, co);
			statement.setInt(4, empID);
			statement.executeUpdate();
			
			//4. update SQL문 실행
			int rowCnt = statement.executeUpdate();
			System.out.println("갱신된 건수 : " + rowCnt);
			
			
			//4.1 select SQL문 실행
			String selectSql = 
	"SELECT employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id from employees where employee_id =?";
			

			statement2 = connection.prepareStatement(selectSql);
//			//사원번호 파라미터 설정
			statement2.setInt(1, empID);
			
			
			

		
			ResultSet rs = statement2.executeQuery();
			while(rs.next()) {
				int employee_id = rs.getInt(1);
				String first_name = rs.getString(2);
				String last_name = rs.getString(3);
				String email = rs.getString(4);
				String phone_number = rs.getString(5);
				Date hire_date = rs.getDate(6);
				String job_id = rs.getString(7);
				int salary = rs.getInt(8);
				float commission_pct = rs.getFloat(9);
				int manager_id = rs.getInt(10);
				int department_id = rs.getInt(11);
				System.out.println(employee_id + " " + first_name + " " + last_name + " " + email + " " + phone_number + " " + hire_date + " " + job_id + " " + salary + " " + commission_pct + " " + manager_id + " " + department_id);
			}//while
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(statement != null) statement.close();
				if(statement2 != null) statement2.close();
				if(connection != null) connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}//class
