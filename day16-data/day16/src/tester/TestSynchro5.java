package tester;

import utils.SynchroUtils;

public class TestSynchro5 {
	private static boolean exit = false;
	public static void main(String[] args) throws Exception{
		SynchroUtils u1 = new SynchroUtils();
		
		Thread t1 = new Thread(() -> {
			while (!exit)
				u1.test();
		});
		Thread t2 = new Thread(() -> {
			while (!exit) {
				synchronized (u1) {
					u1.testMeAgain();
				}
				
			}
		});
		t1.start();t2.start();
		System.out.println("Press enter to stop");
		System.in.read();
		exit=true;
		t1.join();t2.join();
		System.out.println("main over....");
		

	}

}
