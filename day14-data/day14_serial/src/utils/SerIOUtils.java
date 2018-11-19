package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.app.core.Emp;

public class SerIOUtils {


	public static void storeEmpInfo(List<Emp> l1, String fn) throws Exception {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fn))) {
			out.writeObject(l1);
		}
	}

	@SuppressWarnings("unchecked")
	public static List<Emp> restoreInfo(String fn) throws Exception {
		// validate file
		File f1 = new File(fn);
		if (f1.exists() && f1.isFile() && f1.canRead()) {
			try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(f1)))
			{
				return (List<Emp>) in.readObject();
			}
		} else {
			System.out.println("Invalid file");
			return null;
		}
	}
}
