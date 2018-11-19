package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.app.core.Emp;

public class IOUtils {
	private PrintWriter pw;
	public IOUtils(String fileName) throws IOException {
		pw=new PrintWriter(new FileWriter(fileName));
	}
	//clean up
	public void cleanUp()
	{
		if(pw != null)
			pw.close();
	}
	//write data
	public void writeEmpData(Emp e)
	{
		pw.println(e);
	}
}
