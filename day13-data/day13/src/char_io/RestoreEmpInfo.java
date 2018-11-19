package char_io;

import static utils.TextIOUtils.*;

import java.util.Scanner;

public class RestoreEmpInfo {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name to restore emp info");
			restoreEmpInfo(sc.next()).forEach((k, v) -> System.out.println(v));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
