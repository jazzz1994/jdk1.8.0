package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import com.app.core.User;

import cust_excs.UserHandlingException;

public class ValidationUtils {

	public static void validateEmail(User u, HashMap<String, User> users) throws Exception {
		if (users.putIfAbsent(u.getEmail(), u) != null)
			throw new UserHandlingException("User subscription failed : Dup email ID!!!!");
	}

}
