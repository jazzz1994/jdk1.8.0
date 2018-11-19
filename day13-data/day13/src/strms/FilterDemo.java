package strms;

import static utils.CollectionUtils.*;
import static com.app.core.AcType.*;

import java.util.List;

import com.app.core.BankAccount;

public class FilterDemo {

	public static void main(String[] args) throws Exception {
		// apply interest to all saving type of accts.
		List<BankAccount> l1 = populateData();
		System.out.println("orig list");
		l1.forEach(System.out::println);
		System.out.println("filtered list");
		l1.stream().filter(a -> a.getType() == SAVING).
		forEach(System.out::println);
		

	}

}




