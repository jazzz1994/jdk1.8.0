package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidationRules {
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	public static Date validateDate(String dt) throws Exception
	{
		return sdf.parse(dt);
	}

}
