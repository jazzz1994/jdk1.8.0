package utils;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import static utils.Validationrules.*;
import com.app.core.Customer;
import cust_exc.CustomerHandlingException;
import java.util.Scanner;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import  static utils.Colectionutils.*;
public class Binutils {
public static void storeinformation(String fn,Map<String,Customer> f)throws Exception
{     // Map<String,Customer> f=populatedata();

SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	try(ObjectOutputStream out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fn)));)
       {
		/*f.forEach((k,v)->{
			try {
				out.writeUTF(v.getEmail());
				out.writeDouble(v.getAmount());
				out.writeUTF(v.getPassword());
				out.writeUTF(sdf.format(v.getRegistrationdate()));
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});*/
	out.writeObject(f);
       }
	
}
public static void restoreinformation(String fn)throws Exception
{
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	 File f1 =new File(fn);
	 if(f1.exists()&&f1.isFile()&&f1.canRead())
		 /*arrayList<customer> cus=new arrayList<>();
		  * 
		  * cus.add()
		  * */
	 {			
		try	(ObjectInputStream in=new ObjectInputStream(new BufferedInputStream(new FileInputStream(f1)));)
		{
		/*while(in.available()!=0)
		{
			System.out.println(in.readUTF()+ in.readDouble()+ in.readUTF()+in.readUTF());
	
		}*/
			System.out.println(in.readObject());
		}
		
		}
	 else
	 {         System.out.println("invalid file name");
	                }
}

}
