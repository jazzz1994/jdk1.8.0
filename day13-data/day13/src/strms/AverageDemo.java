package strms;

import static com.app.core.AcType.SAVING;
import static utils.CollectionUtils.populateData;

import java.util.List;

import com.app.core.BankAccount;

public class AverageDemo {

	public static void main(String[] args) throws Exception{
		List<BankAccount> l1 = populateData();
		System.out.println("orig list");
		System.out.println("Avg of saving a/c bal "+
		l1.stream().filter(a->a.getType()==SAVING).
		mapToDouble(a->a.getBalance()).average().orElse(-1));

	}

}





