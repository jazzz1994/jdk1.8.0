package thrds3;

public class Tester {

	public static void main(String[] args) throws Exception {
		// display the details of main thrd
		System.out.println(Thread.currentThread());
		//create 3 thrds & confirm concurrency
		MyThread t1=new MyThread("one");
		MyThread t2=new MyThread("two");
		MyThread t3=new MyThread("three");
		System.out.println("main waiting IMPATIENTLY for child thrds to finish exec");
		t1.join(1000);
		t2.join(2000);
		t3.join(3000);
		System.out.println("Confirming thrd sts "+t2.isAlive());
		System.out.println("interrupting child thrds exec...");
		t1.interrupt();
		t2.interrupt();
		t3.interrupt();
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Confirming thrd sts "+t2.isAlive());
		System.out.println("main over...");

	}

}
