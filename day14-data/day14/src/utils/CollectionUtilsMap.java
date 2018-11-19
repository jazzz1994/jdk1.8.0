package utils;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.app.core.Emp;

public class CollectionUtilsMap {
	
	// rets emp map
	public static Map<Integer, Emp> populateEmpMap() {
		HashMap<Integer, Emp> hm = new HashMap<>();
		hm.put(1, new Emp(1, "abc1", 10000));
		hm.put(10, new Emp(10, "abc5", 34000));
		hm.put(45, new Emp(45, "abc2", 17000));
		hm.put(11, new Emp(11, "abc8", 12000));
		return hm;
	}

	// method to ret emps sorted as per salary
	public static List<Emp> getSortedEmpsBySalary(Map<Integer, Emp> emps) {
		// hm--coll---AL
		ArrayList<Emp> l1 = new ArrayList<>(emps.values());
		Collections.sort(l1, (e1, e2) -> ((Double) e1.getSalary()).compareTo(e2.getSalary()));
		return l1;
	}

}







