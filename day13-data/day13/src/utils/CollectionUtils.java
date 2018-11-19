package utils;

import java.util.ArrayList;
import java.util.List;
import static utils.ValidationUtils.*;

import com.app.core.BankAccount;

public class CollectionUtils {
	public static List<BankAccount> populateData() throws Exception {
		ArrayList<BankAccount> l1 = new ArrayList<>();
		l1.add(new BankAccount(100, "abc", 20000, validateDate("21/3/2018"), validateAcctType("saving")));
		l1.add(new BankAccount(10, "abc5", 10000, validateDate("1/2/2017"), validateAcctType("current")));
		l1.add(new BankAccount(56, "abc2", 120000, validateDate("1/5/2016"), validateAcctType("saving")));
		l1.add(new BankAccount(123, "abc4", 110000, validateDate("11/6/2018"), validateAcctType("fd")));
		return l1;
	}
}
