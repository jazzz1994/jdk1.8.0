package tester;

import tasks.PrinterTask;
import utils.PrintUtils;

public class TestThreadsSynchro {

	public static void main(String[] args) throws Exception{
		//create SINGLE instance PrintUtils
		PrintUtils u1=new PrintUtils();
		//create tasks
		PrinterTask task1=new PrinterTask(u1, "Hello how are u ?");
		PrinterTask task2=new PrinterTask(u1, "Great  with Multithreading happening!!!!");
		//thrds 
		Thread t1=new Thread(task1);
		Thread t2=new Thread(task2);
		t1.start();t2.start();
		t1.join();t2.join();
		System.out.println("main over....");

	}

}
