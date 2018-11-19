package srvrs;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static final int SERVER_PORT = 4500;

	public static void main(String[] args) {
		System.out.println("Waiting for clnt conn.....");
		try (ServerSocket ss = new ServerSocket(SERVER_PORT, 3);
				Socket ds = ss.accept();) {

			System.out.println(
					"cn accepted from clnt IP " + ds.getInetAddress().getHostName() + " clnt port " + ds.getPort());
			try(DataOutputStream out=new DataOutputStream(ds.getOutputStream());
					DataInputStream in=new DataInputStream(ds.getInputStream()))
			{
				//read req
				System.out.println("srvr : clnt sent "+in.readUTF());
				//send resp
				out.writeUTF("I m good! Bye for now.....");
			}

		} catch (Exception e) {
			e.printStackTrace();
			;

		}

	}

}
