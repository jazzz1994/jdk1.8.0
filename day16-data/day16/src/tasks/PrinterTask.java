package tasks;

import utils.PrintUtils;

public class PrinterTask implements Runnable {
	private PrintUtils u;
	private String mesg;
	public PrinterTask(PrintUtils u, String mesg) {
		super();
		this.u = u;
		this.mesg = mesg;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			 while(true)
				 u.writeMesg(mesg);
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
