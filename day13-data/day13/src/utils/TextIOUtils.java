package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Emp;

public class TextIOUtils {
	// write a method to store sorted emp info
	// on text file in buffered manner
	// JA---PW---FW---TextFile
	public static void writeEmpInfo(List<Emp> list, String fileName) throws Exception {
		try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
			/*
			 * list.forEach(e -> { System.out.println("printing data");
			 * pw.println(e); });
			 */
			// OR
			list.forEach(pw::println);
		}
	}

	// write a method which will restore emp info from text file
	// into Map<I,Emp>
	public static Map<Integer, Emp> restoreEmpInfo(String fileName) throws Exception {
		HashMap<Integer, Emp> hm = new HashMap<>();
		// validate file
		File f1 = new File(fileName);
		if (f1.exists() && f1.isFile() && f1.canRead()) {
			// scanner(File f)
			try (Scanner scannerFile = new Scanner(f1)) {
				while (scannerFile.hasNextLine()) {
					try (Scanner scannerString = new Scanner(scannerFile.nextLine())) {
						Emp e =
								new Emp
								(scannerString.nextInt(), scannerString.next(), scannerString.nextDouble());
						hm.put(e.getId(), e);
					}
				}
			}
		/*	System.out.println("restored map ");
			hm.forEach((k,v)->System.out.println(v));
	*/		return hm;
		} else {
			System.out.println("Invalid file name.....");
			return hm;
		}
	}

}
