package char_io;

import java.util.Scanner;
import static utils.CollectionUtilsMap.*;
import static utils.TextIOUtils.*;

public class StoreEmpInfo {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name to store emp info");
			writeEmpInfo(getSortedEmpsBySalary
					(populateEmpMap()), sc.next());
			System.out.println("data write over....");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
