package vn.com.tma.trainingplan.designpattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCSingleton {

	private static String url = "jdbc:postgresql://localhost/test_db";
	private static String user = "postgres";
	private static String password = "nelson";
	private static JDBCSingleton jdbc;
	
	private JDBCSingleton() {}
	
	public static JDBCSingleton getInstance() {
		if(jdbc == null) {
			jdbc = new JDBCSingleton();
		}
		return jdbc;
	}
	
	private static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}
	
	public int insert(String column1, String column2) throws SQLException {
		String SQL = "INSERT INTO my_table(my_column1, my_column2) "
				+ "VALUES (?, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		int recordCounter=0;
		try {
			conn = getConnection();
			ps = conn.prepareStatement(SQL);
			ps.setString(1, column1);
			ps.setString(2, column2);
			recordCounter =  ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(ps!= null) {
				ps.close();
			}
			if(conn != null) {
				conn.close();
			}
		}
		return recordCounter;
	}
}
