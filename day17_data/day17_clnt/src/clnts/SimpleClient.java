package clnts;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClient {

	public static void main(String[] args) {
		System.out.println("Enter server IP n server port");
		try (Scanner sc = new Scanner(System.in); 
				Socket s1 = new Socket(sc.next(), sc.nextInt());) {
			System.out.println("Connected to " + s1.getInetAddress().getHostName() + " server port " + s1.getPort()
					+ " " + s1.getLocalPort());
			//attach SUITABLE data strms to socket device
			try(DataOutputStream out=new DataOutputStream(s1.getOutputStream());
					DataInputStream in =new DataInputStream(s1.getInputStream()))
			{
				//send req
				out.writeUTF("Hello , server how r u?");
				//await resp
				System.out.println("clnt : server sent "+in.readUTF());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
