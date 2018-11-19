package lambdas1;

import static lambdas1.Converter.*;
import static utils.ValidationUtils.validateAcctType;
import static utils.ValidationUtils.validateDate;

import com.app.core.BankAccount;

public class Test {

	public static void main(String[] args) throws Exception {
		// func literal String ---> len
		Converter<String, Integer> func1 = s -> s.length();
		System.out.println("str len via static method" + testConvert("asdffsdf", func1));
		// cel ---deg fa
		System.out.println("deg F " + testConvert(30, c -> c * 1.8 + 32));
		// convert BankAccount --balance
		BankAccount a1 = new BankAccount(100, "abc", 20000, validateDate("21/3/2018"), validateAcctType("saving"));
		System.out.println(testConvert(a1, a->a.getBalance()));
	}

}





