package synchro_coll;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> l1 = new ArrayList<>();
		Thread t1 = new Thread(() -> {
			int data = 1;
			while (true) {
				synchronized (l1) {
					l1.add(data++);
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (l1) {
					if (l1.size() > 1000)
						l1.clear();
				}

			}
		});
		Thread t2 = new Thread(() -> {
			System.out.println("in thrd " + Thread.currentThread().getName());
			while (true)
				synchronized (l1) {
					for (int i : l1)
						System.out.println(i);
				}

		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("main over....");

	}

}
