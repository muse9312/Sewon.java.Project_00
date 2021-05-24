package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCParameter {
	public static void main(String[] args) {
		if(args.length < 3) {
			System.out.println("�ƱԸ�Ʈ�� �Է��ϰ� �����ϼ���");
			System.exit(0);
		}
		//������
		String jobName = args[0];
		//�޿� String -> float ��ȯ
		float salary = Float.parseFloat(args[1]);
		//�����ȣ String -> int ��ȯ
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
		//1. JDBC Driver ��ü����
		//Unhandled exception type ClassNotFoundException
		//try / catch ���� ���
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver Loading ����");
		} catch (ClassNotFoundException e) {
			System.err.println("���� �޽��� " + e.getMessage());
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
			//2. Connection(DB�� ����) ��ü����
			connection = DriverManager.getConnection(url, user, password);
			System.out.println(connection.getClass().getName());
			//3. Statement(SQL�� ����) ��ü����
			//createStatement() : Factory Method
			statement = connection.createStatement();
			System.out.println(statement.getClass().getName());
			
			//4. update SQL�� ����
			int rowCnt = statement.executeUpdate(updateSql);
			System.out.println("���ŵ� �Ǽ� : " + rowCnt);
			//4.1 select SQL�� ����
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
			// TODO Auto-generated catch block
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
