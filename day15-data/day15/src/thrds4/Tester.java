package thrds4;

public class Tester {

	public static void main(String[] args) throws Exception {
		// display the details of main thrd
		System.out.println(Thread.currentThread());
		//create 3 thrds & confirm concurrency using imple Runnable
		MyRunnableTask task=new MyRunnableTask();
		Thread t1=new Thread(task,"one");
		Thread t2=new Thread(task,"two");
		Thread t3=new Thread(task,"three");
		//NEW---RUNNABLE
		t1.start();
		t2.start();
		t3.start(); //4 RUNNABLE
     	System.out.println("main waiting for child thrds to finish exec");
     	t1.join();	t2.join();	t3.join();
		System.out.println("main over...");

	}

}
