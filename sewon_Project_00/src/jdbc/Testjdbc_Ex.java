package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Testjdbc_Ex {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.OracleDriver");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String url = "jdbc:oracle:thin:@localhosts:1521:xe";
		String user = "Root";
		String password = "oracle";
		Connection connection = null;
		Statement statement = null;

		try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println(connection.getClass().getName());

			String selectSQL = "select 사원번호,이름,직종,mgr,입사날짜,연봉,커미션,deptno";
			@SuppressWarnings("null")
			ResultSet rs = statement.executeQuery(selectSQL);

			System.out.println(rs.getClass().getName());

			while (rs.next()) {
				int 사원번호 = rs.getInt("사원번호");
				String 이름 = rs.getString("이름");
				String 직종 = rs.getString("직종");
				int mgr = rs.getInt("mgr");
				Date 입사날짜 = rs.getDate("입사날짜");
				int 연봉 = rs.getInt("연봉");
				int 커미션 = rs.getInt("커미션");
				int deptno = rs.getInt("deptno");

				System.out.println(
						사원번호 + " " + 이름 + " " + 직종 + " " + mgr + " " + 입사날짜 + " " + 연봉 + " " + 커미션 + " " + deptno);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
