package utils;

import cust_exc.CustomerExceptionHandling;

import java.util.Date;
import java.util.GregorianCalendar;
import static java.util.Calendar.*;
import static com.app.core.Customer.*;
public class Validationrules 
{
	public static final int MAX_LEN;
	public static final int MIN_LEN;
	static
	{
	MAX_LEN=10;
	MIN_LEN=5;
		
		
	}
public static void validateemail(String email) throws Exception
{
	if(email.length()<MIN_LEN|| email.length()>MAX_LEN) 
	{
    throw new CustomerExceptionHandling("invalid email");}
	System.out.println("valid email");
}
public static void validatepassword(String password) throws Exception
{
	if(!password.matches("[a-z]*[A-Z]*[0-9]*[@,#,$,%,&]"))
    throw new CustomerExceptionHandling("invalid password");
	System.out.println("valid password");
	
}
public  static void validateamount(double regAmount) throws Exception
{
	if((regAmount%500)!=0)
    throw new CustomerExceptionHandling("invalid amount");
	System.out.println("valid amount");
}
public  static Date validatedate(String date) throws Exception
{
Date d=sdf.parse(date);
GregorianCalendar gc=new GregorianCalendar();
gc.set(DATE,7);
gc.set(MONTH,9);
if(!(d.before(gc.getTime())))
   throw new CustomerExceptionHandling("invalid amount");
System.out.println("valid date");
	return d;
}

}
