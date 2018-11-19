package db;
import java.sql.*;

public class TestMySQLCn {

	public static void main(String[] args) {
		try
		{
			//load JDBC driver class in JVM's method area.
			//optional for Java SE (JDBC 4.x)
		//	Class.forName("com.mysql.jdbc.Driver");
			try(Connection cn=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/test", "root", ""))
			{
				System.out.println("connected to db "+cn);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
