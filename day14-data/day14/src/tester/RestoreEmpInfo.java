package tester;

import com.app.core.Emp;
import static utils.BinIOUtils.*;

public class RestoreEmpInfo {

	public static void main(String[] args) {
		try {
			System.out.println("Restored info " 
		+ restoreEmpInfo("emps.data"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
