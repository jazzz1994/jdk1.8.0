 package utils;
import cust_exc.CustomerHandlingException;
import java.util.Date;
import java.util.GregorianCalendar;
import com.app.core.Registration;
import static java.util.Calendar.*;
import static com.app.core.Customer.*;


public class Validationrules {
	public static final int MAX_LEN;
	public static final int MIN_LEN;
	
static
{
	
	MIN_LEN=5;
	MAX_LEN=10;
	
}
public static void ValidateEmail(String email) throws Exception
{
if(email.length()<MIN_LEN||email.length()>MAX_LEN||!email.contains("@")	)
{       
		throw new CustomerHandlingException("invalid email");}
 System.out.println("valid email");

}
public static void ValidatePassword(String password) throws Exception
{/*
if(!password.matches("\\D+")||!password.matches("\\W+"))
{
throw 
}
*/
if(!password.matches("[a-z]*[A-Z]*[0-9]*[@,#,$,%,*]"))
{
		throw new CustomerHandlingException("invalid password");
}
System.out.println("valid password");

}
public static void ValidateAmount(double amount) throws Exception
{
    if((amount %500)!=0)
		throw new CustomerHandlingException("invalid amount");

System.out.println("valid amount");
}
public static Date ValidateDate(String date) throws Exception
{
	Date d1=sdf.parse(date);
    GregorianCalendar gc=new GregorianCalendar();
		gc.set(DATE,30);
		gc.set(MONTH,11);
  if(!d1.before(gc.getTime()))
	  throw new CustomerHandlingException("invalid date");
 
return d1;
}
public static Registration ValidateRegistration(String types) throws Exception
{
	//System.out.println(Registration.valueOf(types.toUpperCase()));

return Registration.valueOf(types.toUpperCase());
}

}



