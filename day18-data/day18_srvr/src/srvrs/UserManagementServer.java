package srvrs;

import static utils.SerFileIOUtils.*;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

import com.app.core.User;

import static utils.NetUtils.*;

public class UserManagementServer {

	public static void main(String[] args) throws Exception{
		HashMap<String, User> users = null;
		System.out.println("waiting for clnts....");
		try {
			// restore user info from bin file
			users = readUserInfo();
			System.out.println("restored used info");
			users.forEach((k, v) -> System.out.println(v));
			// ss , accept
			try (ServerSocket ss = new ServerSocket(5000, 1); Socket ds = ss.accept();) {
				System.out.println("Accepted cn from " + ds.getInetAddress().getHostName());
				ObjectInputStream in = new ObjectInputStream(ds.getInputStream());
				DataOutputStream out = new DataOutputStream(ds.getOutputStream());
				// keep servicing clnt till clnt JA is terminated
				while (true)
					service(in, out, users);

			}
		} catch (Exception e) {
			if (e instanceof EOFException)
				writeUserInfo(users);
			else
				e.printStackTrace();
		}

	}

}
