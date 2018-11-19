package tester;

import com.app.core.Emp;
import static utils.SerIOUtils.*;

public class RestoreEmpInfo {

	public static void main(String[] args) {
		try {
			restoreInfo("emps.ser").forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
