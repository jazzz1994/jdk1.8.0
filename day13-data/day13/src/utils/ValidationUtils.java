package utils;

import java.util.Date;

import com.app.core.AcType;

import static com.app.core.BankAccount.*;
import cust_excs.AccountHandlingException;

public class ValidationUtils {
	public static final double MIN_BAL;
	static {
		MIN_BAL=1000;
	}
	public static void validateBalance(double bal) throws Exception
	{
		if(bal < MIN_BAL)
			throw new AccountHandlingException("insufficient funds");
	}
	public static Date validateDate(String dt) throws Exception
	{
		return sdf.parse(dt);//rets parsed date inst
	}
	public static AcType validateAcctType(String type) throws Exception
	{
		return AcType.valueOf(type.toUpperCase());
	}
}
