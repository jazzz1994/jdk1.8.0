package utils;

import java.util.Arrays;

public class PrintUtils {
	public synchronized void writeMesg(String message) throws Exception
	{
		System.out.print("{");
		for(String s : message.split(" "))
		{
			System.out.print(s+" , ");
			Thread.sleep(10);
		}
		System.out.println("}");
/*		//OR
		Arrays.stream(message.split(" ")).forEach(System.out::print);
*/		
	}
}
