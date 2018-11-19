package utils;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import static utils.ValidationUtils.*;

import com.app.core.User;

public class NetUtils {
	public static void service(ObjectInputStream in, DataOutputStream out, HashMap<String, User> hm) throws Exception {
		try {
			// read cmd form clnt
			switch (in.readUTF()) {
			case "subscribe user":
				// read user details from clnt
				User u = (User) in.readObject();
				// validate user
				validateEmail(u, hm);
				// success
				out.writeUTF("User subcscription succeeded!!!");
				break;

			default: out.writeUTF("Invalid command");
				break;
			}
		} catch (EOFException e) {
			System.out.println("clnt has terminated....so shutting down server..");
			throw e;
		} catch (Exception e) {
			// TO DO
			out.writeUTF(e.getMessage());
		}
	}
}
