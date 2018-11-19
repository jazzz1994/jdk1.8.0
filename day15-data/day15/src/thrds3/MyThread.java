package thrds3;

public class MyThread extends Thread {
	public MyThread(String nm) {
		super(nm);// NEW named thrd
		// System.out.println(Thread.currentThread().getName());
		start();// RUNNABLE
		// run();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			int i = 0;
			// thrd exec logic
			while (true) {
				Thread.sleep(500);// to force ctx switching
				System.out.println(Thread.currentThread().getName() + " # " + (i++));
			}
		} catch (Exception e) {
			System.out.println(getName() + " err " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");
	}
}
