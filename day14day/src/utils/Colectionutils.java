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

public class Colectionutils {
	Scanner sc=new Scanner(System.in);
public static Map<String,Customer> populatedata()throws Exception
{ 
	HashMap<String,Customer> arr =new HashMap<String,Customer >();
	try
	{
System.out.println( arr.put("marutt@",new Customer("marutt@",700000.00,"marutt1@",ValidateDate("12-12-2003"),ValidateRegistration("LOGIN")))); 
System.out.println(arr.put("marutt1@",new Customer("marut1@",500000.00,"marutt2@",ValidateDate("12-12-2003"),ValidateRegistration("LOGIN"))));
System.out.println( arr.put("parutt2@",new Customer("parutt2@",800000.00,"marutt2@",ValidateDate("12-12-2009"),ValidateRegistration("LOGOUT"))));
System.out.println(arr.put("darutt3@",new Customer("darutt3@",700000.00,"marutt3@",ValidateDate("12-12-2008"),ValidateRegistration("LOGOUT"))));
System.out.println(arr.put("marutt4@",new Customer("marutt4@",1100000.00,"marutt4@",ValidateDate("12-12-2007"),ValidateRegistration("LOGIN"))));
	
	}
catch(Exception e)
{    e.printStackTrace();}
return arr;
}
public  static List<Customer> date(Map<String,Customer> l1) throws Exception
{
	

	ArrayList<Customer> a2=new ArrayList<>(l1.values());
	 Collections.sort(a2,(e1,e2)->
	    	 (e1.getRegistrationdate()).compareTo(e2.getRegistrationdate()));
	    	        
	  	     return a2;    
	            
	    	 }
	     }
		 