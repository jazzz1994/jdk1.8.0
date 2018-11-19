package db;

import static utils.DBUtils.*;
import java.sql.*;

public class TestStatement {

	public static void main(String[] args) {
		try (Connection cn = getConnection();
				Statement st = cn.createStatement();
				ResultSet rst = st.executeQuery("select * from customer");) {
			while (rst.next())
				System.out.printf("ID %d FirstName %s Lastname %s email %s \n", rst.getInt("id"), rst.getString("first_name"),
						rst.getString("last_name"),rst.getString("email"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
