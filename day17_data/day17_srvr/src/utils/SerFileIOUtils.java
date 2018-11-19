package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.app.core.User;

public class SerFileIOUtils {
	 //write HM of users info to bin file --serialization
	public static void writeUserInfo(HashMap<String,User> hm) throws Exception
	{
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("users.ser")))
		{
			out.writeObject(hm);
		}
	}
	@SuppressWarnings("unchecked")
	public static HashMap<String,User> readUserInfo() throws Exception
	{
		File f1=new File("users.ser");
		if(f1.exists() && f1.isFile() && f1.canRead())
		{
			try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(f1)))
			{
				return (HashMap<String,User>)in.readObject();
			}
		}
		return new HashMap<>();
	}
	

}
