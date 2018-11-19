package utils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.app.core.Emp;

public class BinIOUtils {
	//add a method to store single emp details on bin file using DOS7
	public static void storeEmpInfo(Emp e,String fn) throws Exception
	{
		try(DataOutputStream out=new DataOutputStream(new FileOutputStream(fn)))
		{
			//id
			out.writeInt(e.getId());
			//nm
			out.writeUTF(e.getName());
			//sal
			out.writeDouble(e.getSalary());
		}
	}
	//add a method to restore single emp details from bin file using DIS
	public static Emp restoreEmpInfo(String fn) throws Exception
	{
		//validate
		File f1=new File(fn);
		if(f1.exists() && f1.isFile() && f1.canRead())
		{
			try(DataInputStream in=
					new DataInputStream(new FileInputStream(f1)))
			{
				return new Emp(in.readInt(), in.readUTF(), in.readDouble());
			}
		}else {
			System.out.println("Invalid file name");
			return null;
		}
	}
	
	
	
	
	
	
	
	
	
	
}
