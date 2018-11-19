package thrds1;

public class Tester {

	public static void main(String[] args) throws Exception{
		// display the details of main thrd
		System.out.println(Thread.currentThread());
		//create 3 thrds & confirm concurrency
		MyThread t1=new MyThread("one");
		MyThread t2=new MyThread("two");
		MyThread t3=new MyThread("three");
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " # " + i);
		}
		System.out.println("main over...");

	}

}
