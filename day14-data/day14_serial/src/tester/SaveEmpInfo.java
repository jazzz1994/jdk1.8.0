package tester;

import com.app.core.Emp;
import static utils.SerIOUtils.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SaveEmpInfo {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {

			List<Emp> l1 = Arrays.asList(new Emp(12, "abc", 12000), new Emp(1, "abc3", 13000),
					new Emp(120, "abc4", 14000));
			//assign addrs to emps
			l1.forEach(e->{
				System.out.println("Enter adr -- ci st co zipcode");
				e.assignEmpAddress(sc.next(), sc.next(), sc.next(), sc.next());
			});
			//display emp info
			l1.forEach(System.out::println);
			
			storeEmpInfo(l1,"emps.ser");
			System.out.println("data stored");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
