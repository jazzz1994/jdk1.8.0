package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.app.core.Emp;

public class CollectionUtils {
	public static List<List<Emp>> populateData() {
		List<Emp> l1 = Arrays.asList(new Emp(1, "abc1", "rnd", 11000), new Emp(2, "abc2", "rnd", 12000),
				new Emp(3, "abc3", "rnd", 13000));
		List<Emp> l2 = Arrays.asList(new Emp(4, "abc4", "hr", 14000), new Emp(5, "abc5", "hr", 15000),
				new Emp(6, "abc6", "hr", 16000));
		List<Emp> l3 = Arrays.asList(new Emp(7, "abc7", "sales", 17000), new Emp(8, "abc5", "sales", 18000),
				new Emp(9, "abc6", "sales", 19000));
		return Arrays.asList(l1, l2, l3);
	}
}
