package utils;

import java.sql.*;

public class DBUtils {
	// static method to ret FIXED DB cn instance
	public static Connection getConnection() throws Exception {
		String dbURL = "jdbc:mysql://localhost:3306/web_customer_tracker";
		return DriverManager.getConnection(dbURL, "springstudent", "springstudent");
	}

}
