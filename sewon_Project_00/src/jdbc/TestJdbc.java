package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbc {

	public static void main(String[] args) {

		// 1. JDBC Driver 객체생성
		// ================================================================================

		// try / catch 구문 사용
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver Loading 성공");
		} catch (ClassNotFoundException e) {
			System.err.println("에러 메세지" + e.getMessage());
			e.printStackTrace();
		}

		// MySQL
		// String url = "jdbc:mysql://localhost:3306/testDB

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection connection = null;
		Statement statement = null;

		try {
			// T4CConnection com = new T4CConnection(); (X)
			// Connection com = new T4CConnection(); (OX) = 오라클의 의존성을 벗어나지 못했다.
			// Connection com = new DriverManager.getConnection(): = 특정 DB에 존속되지 않게 해줌
			// getConnection === 자바에서 객체를 생성하게 도와주는 메서드( Factory Method )

			// alt + shift + L ==> ??? 자동생성

			// 2. Connection 객체생성
			connection = DriverManager.getConnection(url, user, password);
			System.out.println(connection.getClass().getName());

			// 3. Statement(SQL전송) 객체생성
			// createStatement() === Factory Method
			statement = connection.createStatement();
			System.out.println(statement.getClass().getName());

			// 4. updateSQL 실행

			String sql = "update emp set sal = 2500, comm = 100 where empno = 7782";

			int rowCnt = statement.executeUpdate(sql);
			System.out.println("갱신된 건수" + rowCnt);

			// 4.1 select SQL 실행

			String selectSQL = "select empno,ename,hiredate,sal, comm from emp";

			ResultSet rs = statement.executeQuery(selectSQL);
			System.out.println(rs.getClass().getName());

			while (rs.next()) {

				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				Date hiredate = rs.getDate("hiredate");
				float salary = rs.getFloat("sal");
				String comm = rs.getString("comm");

				System.out.println(empno + " " + ename + " " + hiredate + " " + salary + " " + comm + " ");

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
