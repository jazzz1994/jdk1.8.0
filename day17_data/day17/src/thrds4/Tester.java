package thrds4;

public class Tester {

	public static void main(String[] args) throws Exception {
		// display the details of main thrd
		System.out.println(Thread.currentThread());
		//create 3 thrds & confirm concurrency using imple Runnable
		MyRunnableTask task=new MyRunnableTask();
		Thread t1=new Thread(task,"one");
		Thread t2=new Thread(task,"two");
		t2.setDaemon(true);
		Thread t3=new Thread(task,"three");
		//NEW---RUNNABLE
		t1.start();
		t2.start();
		t3.start(); //4 RUNNABLE
     	System.out.println("main waiting for child thrds to finish exec");
     	t1.join(1000);	t2.join(500);	t3.join(3000);
    // 	t1.interrupt();t2.interrupt();t3.interrupt();
		System.out.println("main over...");

	}

}
