package thrds1;

public class MyThread extends Thread {
	public MyThread(String nm) {
		super(nm);// NEW named thrd
	//	System.out.println(Thread.currentThread().getName());
		start();// RUNNABLE
	//	run();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			// thrd exec logic
			for (int i = 0; i < 10; i++) {
				Thread.sleep(500);//to force ctx switching
				System.out.println(Thread.currentThread().getName() + " # " + i);
			}
		} catch (Exception e) {
			System.out.println(getName() + " err " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");
	}
}
