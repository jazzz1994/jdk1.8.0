package lambdas1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// create LHM<I,S>
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(1, "a1");
		lhm.put(2, "a2");
		lhm.put(3, "a3");
		lhm.put(4, "a4");
		lhm.put(5, "a5");
		lhm.forEach((k, v) -> System.out.println(k + " : " + v));
		//method reference 
		ArrayList<Integer> l1=new ArrayList<>();
		Collections.addAll(l1, 10,2,34,56,67,7,8,9);
		System.out.println("via lambda expr");
		l1.forEach(i->System.out.println(i));
		System.out.println("via method ref");
		l1.forEach(System.out::println);

	}

}



