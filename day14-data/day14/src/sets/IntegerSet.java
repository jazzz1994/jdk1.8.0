package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntegerSet {

	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(23,12,45,23,10,56,78,12);
		HashSet<Integer> hs=new HashSet<>(l1);
		System.out.println("orig HS");
		hs.forEach(System.out::println);
		System.out.println(hs.contains(23));
		hs.remove(23);
		System.out.println("after remove HS");
		hs.forEach(System.out::println);
	}

}
