package common.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static DBUtil _instance;
	private Connection conn = null;
	
	private DBUtil() {
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5434/postgres", "postgres", "password");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static DBUtil getInstance() {
		if(_instance == null) {
			_instance = new DBUtil();
		}
		return _instance;
	}
	
	public Connection getConnection() {
		return this.conn;
	}

}
