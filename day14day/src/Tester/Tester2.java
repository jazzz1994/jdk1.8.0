package Tester;
import static utils.Binutils.*;
import static utils.Colectionutils.*;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import com.app.core.Customer;
public class Tester2 {
public static void main(String[] args)
{ 
	try{
		Map<String,Customer> f=populatedata();
			List<Customer> h=date(f);
			for(Customer e:h)
				System.out.println(e);

		restoreinformation("Customer.ser");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
