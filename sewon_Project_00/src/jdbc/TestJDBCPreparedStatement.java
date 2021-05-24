package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCPreparedStatement {
	public static void main(String[] args) {
		if(args.length < 3) {
			System.out.println("아규먼트를 입력하고 실행하세요");
			System.exit(0);
		}
		//업무명
		String jobName = args[0];
		//급여 String -> float 변환
		float salary = Float.parseFloat(args[1]);
		//사원번호 String -> int 변환
		int empNo = Integer.parseInt(args[2]);
	
		updateEmp(jobName,salary,empNo);
		
	}//main

	private static void updateEmp(String job,float sal,int no) {
		//1. JDBC Driver 객체생성
		//Unhandled exception type ClassNotFoundException
		//try / catch 구문 사용
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver Loading 성공");
		} catch (ClassNotFoundException e) {
			System.err.println("에러 메시지 " + e.getMessage());
			e.printStackTrace();
		}
		//mysql 
		//String url = "jdbc:mysql://localhost:3306/testDB?serverTimezone=UTC";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		Connection connection = null;
		PreparedStatement statement = null;
		PreparedStatement statement2 = null;
		try {
			//2. Connection(DB와 연결) 객체생성
			connection = DriverManager.getConnection(url, user, password);
			System.out.println(connection.getClass().getName());
			//3. Statement(SQL문 전송) 객체생성
			StringBuilder builder = new StringBuilder();
			builder.append("update emp set job=?,")
				   .append(" sal=?")
				   .append(" where empno=?");
			String sql = builder.toString();
			System.out.println("update SQL => " + sql);
			
			//PreparedStatement를 생성
			statement = connection.prepareStatement(sql);
			//SQL문의 파라미터에 값을 설정
			statement.setString(1, job);
			statement.setFloat(2, sal);
			statement.setInt(3, no);
			
			//4. update SQL문 실행
			int rowCnt = statement.executeUpdate();
			System.out.println("갱신된 건수 : " + rowCnt);
			//4.1 select SQL문 실행
			String selectSql = 
	"select empno,ename,job,hiredate,sal,comm from emp where empno=?";
			//Statement stmt = connection.createStatement();
			//Resource leak: 'statement' is not closed at this location
			statement2 = 
					connection.prepareStatement(selectSql);
			//사원번호 파라미터 설정
			statement2.setInt(1, no);
			
			ResultSet rs = statement2.executeQuery();
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String jobs = rs.getString("job");
				Date hiredate = rs.getDate("hiredate");
				float salary = rs.getFloat("sal");
				String comm = rs.getString("comm");
				System.out.println(empno + " " +
								   ename + " " +
								   jobs + " " +
								   hiredate + " " + 
								   salary + " " +
								   comm);
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
