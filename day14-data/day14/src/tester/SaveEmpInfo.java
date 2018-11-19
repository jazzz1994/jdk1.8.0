package tester;

import com.app.core.Emp;
import static utils.BinIOUtils.*;

public class SaveEmpInfo {

	public static void main(String[] args) {
		try {
			Emp e=new Emp(123, "abc", 10000);
			storeEmpInfo(e, "emps.data");
			System.out.println("data stored");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
