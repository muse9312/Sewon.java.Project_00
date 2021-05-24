package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCAutoCommit {
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
		
		StringBuilder builder = new StringBuilder();
		builder.append("update emp set job='"+jobName+"',")
			   .append(" sal="+salary)
			   .append(" where empno="+empNo);
		String sql = builder.toString();
		System.out.println("update SQL => " + sql);
	
		updateEmp(sql);
		
	}//main

	private static void updateEmp(String updateSql) {
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
		Statement statement = null;
		try {
			//2. Connection(DB와 연결) 객체생성
			connection = DriverManager.getConnection(url, user, password);
			//Connection의 AutoCommit mode를 해제하기
			connection.setAutoCommit(false);
			
			System.out.println("Autocommit mode " + connection.getAutoCommit());
			//3. Statement(SQL문 전송) 객체생성
			//createStatement() : Factory Method
			statement = connection.createStatement();
			
			//4. update SQL문 실행
			int rowCnt = statement.executeUpdate(updateSql);
			System.out.println("갱신된 건수 : " + rowCnt);
			//커밋 수행하기
			if(rowCnt == 1) {
				connection.commit();
			}else {
				connection.rollback();
			}
			//4.1 select SQL문 실행
			String selectSql = "select empno,ename,job,hiredate,sal,comm from emp";
			ResultSet rs = statement.executeQuery(selectSql);
			System.out.println(rs.getClass().getName());
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				Date hiredate = rs.getDate("hiredate");
				float salary = rs.getFloat("sal");
				String comm = rs.getString("comm");
				System.out.println(empno + " " +
								   ename + " " +
								   job + " " +
								   hiredate + " " + 
								   salary + " " +
								   comm);
			}//while
			
		} catch (SQLException e) {
			System.out.println("SQL 에러 발생 : " + e.getMessage());
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				if(statement != null) statement.close();
				if(connection != null) connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}//class
