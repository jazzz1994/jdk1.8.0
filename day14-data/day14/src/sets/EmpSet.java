package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import com.app.core.Emp;

public class EmpSet {

	public static void main(String[] args) {
		Emp e1=new Emp(12, "abc", 12000);
		Emp e2=new Emp(1, "abc3", 13000);
		Emp e3	=	new Emp(12, "abc", 12000);
		List<Emp> l1 = Arrays.asList(e1,e2,e3);
		System.out.println(e1.hashCode()+" "+e3.hashCode());
		HashSet<Emp> hs=new HashSet<>(l1);
		System.out.println(hs.size());
		hs.forEach(System.out::println);
		
	

	}

}
