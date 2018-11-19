package utils;

import static utils.ValidationUtils.validateAcctType;
import static utils.ValidationUtils.validateDate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.core.BankAccount;
import com.app.core.Emp;

public class CollectionUtilsMap {
	public static Map<Integer, BankAccount> populateMap() {
		// HM
		HashMap<Integer, BankAccount> accts = new HashMap<>();
		try {
			System.out.println(accts.put(100,
					new BankAccount(100, "abc", 20000, validateDate("21/3/2018"), validateAcctType("saving"))));
			System.out.println(accts.put(10,
					new BankAccount(10, "abc5", 10000, validateDate("1/2/2017"), validateAcctType("current"))));
			System.out.println(accts.put(56,
					new BankAccount(56, "abc2", 120000, validateDate("1/5/2016"), validateAcctType("saving"))));
			System.out.println(accts.put(123,
					new BankAccount(123, "abc4", 110000, validateDate("11/6/2018"), validateAcctType("fd"))));
			System.out.println(accts.put(100,
					new BankAccount(100, "abc12", 23000, validateDate("2/3/2018"), validateAcctType("saving"))));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return accts;
	}

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







