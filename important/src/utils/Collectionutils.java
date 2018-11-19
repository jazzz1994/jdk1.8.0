package utils;

import java.util.ArrayList;
import static utils.Validationrules.*;

import com.app.core.Customer;

public class Collectionutils {

public static ArrayList<Customer> populatelist() throws Exception
{
	ArrayList<Customer> l1=new ArrayList<>();
	
l1.add(new Customer("marutt1@","marut3@)",50000.00,validatedate("12-11-2018")));
l1.add(new Customer("marut2t@","marut3@)",50000.00,validatedate("12-11-2018")));
l1.add(new Customer("marutt3@","marut3@)",50000.00,validatedate("12-11-2018")));
l1.add(new Customer("marutt4@","marut3@)",50000.00,validatedate("12-11-2018")));
return l1;
}
public static void customerlogin(ArrayList<Customer>l1,Customer e,String pass2)
{
	
	System.out.println("enter the email to login and password");
	int index=l1.indexOf(e);
	Customer ref=l1.get(index);
	String pass=ref.getPassword();
	if(pass==pass2)
    System.out.println("login successfuly");
	else
		System.out.println("invalid login");

}
public static void changepassword(ArrayList<Customer>l1,Customer e,String pass2)
{
	
	System.out.println("enter the email to login and password");
	int index=l1.indexOf(e);
	Customer ref=l1.get(index);
	String pass=ref.getPassword();
	if(pass==pass2)
		ref.setPassword("marutt6@");

}
public static void removepassword(ArrayList<Customer>l1,Customer e,String pass2)
{
	
	System.out.println("enter the email to login and password");
	int index=l1.indexOf(e);
	Customer ref=l1.get(index);
	String pass=ref.getPassword();
	if(pass==pass2)
		l1.remove(ref);
	for(Customer r :l1)
		System.out.println(r);

}
}
