package db;

import java.sql.*;
import java.util.Scanner;
import static utils.DBUtils.*;

public class TestPST {

	public static void main(String[] args) {
		String sql = "select * from my_emp where deptid=? and join_date > ?";
		try (Scanner sc = new Scanner(System.in);
				Connection cn = getConnection();
				// pre-parsed n pre-compile stmt obj
				PreparedStatement pst = cn.prepareStatement(sql)) {
			while (true) {
				System.out.println("Enter dept id & join date(yr-mon-day) or quit to exit");
				String dept = sc.next();
				if (dept.equalsIgnoreCase("quit"))
					break;
				Date dt = Date.valueOf(sc.next());
				// set IN params
				pst.setString(1, dept);
				pst.setDate(2, dt);
				// exec query
				try (ResultSet rst = pst.executeQuery()) {
					while (rst.next())
						System.out.printf("ID %d Name %s Salary %.2f Join Date %s %n", rst.getInt(1), rst.getString(2),
								rst.getDouble("salary"), rst.getDate(6));
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
