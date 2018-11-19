package Tester;

import static utils.Validationrules.ValidateDate;
import static utils.Validationrules.ValidateRegistration;

import java.util.Map;

import static utils.Binutils.*;
import static utils.Colectionutils.populatedata;

import com.app.core.Customer;
import java.util.Scanner;
public class Tester1 {
	public static void main(String[] args)
	{
		
		
		try(Scanner sc=new Scanner(System.in);)
		{ 
			Map<String,Customer> f=populatedata();
			System.out.println("enter the address detail");
			
			f.forEach((k,v)->
			    v.assignaddress(sc.next(),sc.next(),sc.next(),sc.next()));
			
			storeinformation("Customer.ser",f);
			
		}
		catch(Exception e)
		{  e.printStackTrace();}
		
		
	}

}
