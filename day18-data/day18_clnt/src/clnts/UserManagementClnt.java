package clnts;

import java.io.DataInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
import static utils.ValidationRules.*;

import com.app.core.User;

public class UserManagementClnt {

	public static void main(String[] args) {
		System.out.println("Enter server IP n port");
		try (Scanner sc = new Scanner(System.in); Socket s1 = new Socket(sc.next(), sc.nextInt());) {
			System.out.println("connected to " + s1.getInetAddress().getHostName());
			// attach suitable data strms
			ObjectOutputStream out = new ObjectOutputStream(s1.getOutputStream());
			out.flush();// to explicitely send ser strm hdr from clnt -->server
			DataInputStream in = new DataInputStream(s1.getInputStream());
			System.out.println("clnt : data strms attached");
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("Options 1 : Subscriber user 10:Exit");
					System.out.println("Enter option");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter user details");
						User u = new User(sc.next(), sc.next(), sc.nextDouble(), validateDate(sc.next()));
						// send cmd , user dtls to server
						out.writeUTF("subscribe user");
						out.writeObject(u);
						out.flush();
						System.out.println("srvr resp : " + in.readUTF());
						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage() + " pls retry !");
				}
				sc.nextLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
