package thrds2;

public class Tester {

	public static void main(String[] args) throws Exception {
		// display the details of main thrd
		System.out.println(Thread.currentThread());
		//create 3 thrds & confirm concurrency
		MyThread t1=new MyThread("one");
		MyThread t2=new MyThread("two");
		MyThread t3=new MyThread("three");
		System.out.println("main waiting for child thrds to finish exec");
		t1.join();
		t2.join();
		t3.join();
		System.out.println("main over...");

	}

}
