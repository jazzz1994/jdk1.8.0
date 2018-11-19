package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import static utils.Collectionutils.*;
import com.app.core.Customer;
import static com.app.core.Customer.*;
import static utils.Validationrules.*; 
import utils.Validationrules; 
public class TestCustomer
{
public static void main(String[] args) {
    
boolean exit=false;
ArrayList<Customer> l1=new ArrayList<>();
	try( Scanner sc=new Scanner(System.in);)
	{
	while(!exit)
	{
	System.out.println("enter the choice 1 for registration");
	 int ch=sc.nextInt();
	 try{
		switch(ch)
		{   
		case 1:System.out.println("enter the email and password regamount");
		 String email=sc.next();
		 String password=sc.next();
		 double amt=sc.nextDouble();
		 String date=sc.next();
		 validateemail(email);
	     validatepassword(password);
	     validateamount(amt);
	    Date d= validatedate(date);
	    l1.add(new Customer(email,password,amt,d));
	    System.out.println("register successfully");
	      break;
		case 2:
			System.out.println("enter the email to login and password");
			Customer e=new Customer(sc.next());
			String pass2=sc.next();
			customerlogin(l1,e,pass2);
		
		  break;
		case 3:
			System.out.println("enter the email to login and password");
			Customer e1=new Customer(sc.next());
			String pass3=sc.next();
			changepassword(l1,e1,pass3);
		
		  break;
		case 4:
			System.out.println("enter the email to login and password");
			Customer e2=new Customer(sc.next());
			String pass4=sc.next();
			removepassword(l1,e2,pass4);
		
		  break;
		case 5:
			System.out.println("enter the date you want");
			String date1=sc.next();
			Date d1=sdf.parse(date1);
			for(int i=0;i<l1.size();i++)
			{
				Customer x=l1.get(i);
				if(d1.before(x.getDate()))
				System.out.println(x);
			}
		
		  break;
		  
		case 6:
			Collections.sort(l1);
			for(Customer ref: l1)
				System.out.println(ref);

		  break;
		  
		case 7:
			Collections.sort(l1,new Comparator<Customer>()
					{
				
				public int compare(Customer o1,Customer o2)
				{
					return o1.getDate().compareTo(o2.getDate());
				}
				}
			
					);
			for(Customer ref: l1)
				System.out.println(ref);

		  break;
		case 8:
			Collections.sort(l1,new Comparator<Customer>()
					{
				
				public int compare(Customer o1,Customer o2)
				{
					return ((Double)o1.getRegAmount()).compareTo(o2.getRegAmount());
				}
				}
			
					);
			for(Customer ref: l1)
				System.out.println(ref);
              break;
		case 9:
			Collections.sort(l1,new Comparator<Customer>()
					{
				
				public int compare(Customer o1,Customer o2)
				{
					if(o1.getDate().after(o2.getDate()))
						return 1;
					else if(o1.getDate().before(o2.getDate()))
						return -1;
					else
					      return ((Double)o1.getRegAmount()).compareTo(o2.getRegAmount());
				}
				}
			
					);
			for(Customer ref: l1)
				System.out.println(ref);

		  
		}
		  
		}
		
		
		
	
	 catch(Exception e)
	 {
		e.printStackTrace(); 
		 
		 
	 }
	}
	
	
	
}
	catch(Exception e)
	{
		e.printStackTrace();
		
		
	}
	finally{   }
}
}