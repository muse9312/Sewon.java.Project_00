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
			System.out.println("�ƱԸ�Ʈ�� �Է��ϰ� �����ϼ���");
			System.exit(0);
		}
		//������
		String jobName = args[0];
		//�޿� String -> float ��ȯ
		float salary = Float.parseFloat(args[1]);
		//�����ȣ String -> int ��ȯ
		int empNo = Integer.parseInt(args[2]);
	
		updateEmp(jobName,salary,empNo);
		
	}//main

	private static void updateEmp(String job,float sal,int no) {
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
		PreparedStatement statement = null;
		PreparedStatement statement2 = null;
		try {
			//2. Connection(DB�� ����) ��ü����
			connection = DriverManager.getConnection(url, user, password);
			System.out.println(connection.getClass().getName());
			//3. Statement(SQL�� ����) ��ü����
			StringBuilder builder = new StringBuilder();
			builder.append("update emp set job=?,")
				   .append(" sal=?")
				   .append(" where empno=?");
			String sql = builder.toString();
			System.out.println("update SQL => " + sql);
			
			//PreparedStatement�� ����
			statement = connection.prepareStatement(sql);
			//SQL���� �Ķ���Ϳ� ���� ����
			statement.setString(1, job);
			statement.setFloat(2, sal);
			statement.setInt(3, no);
			
			//4. update SQL�� ����
			int rowCnt = statement.executeUpdate();
			System.out.println("���ŵ� �Ǽ� : " + rowCnt);
			//4.1 select SQL�� ����
			String selectSql = 
	"select empno,ename,job,hiredate,sal,comm from emp where empno=?";
			//Statement stmt = connection.createStatement();
			//Resource leak: 'statement' is not closed at this location
			statement2 = 
					connection.prepareStatement(selectSql);
			//�����ȣ �Ķ���� ����
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
