package tester;

import static utils.CollectionUtils.*;

import java.util.List;

import com.app.core.Emp;

import tasks.DeptHandler;
import utils.IOUtils;

public class TestThreads {

	public static void main(String[] args) {
		try {
			// get populated emp data
			List<List<Emp>> lists = populateData();
			// create data files ---Utils objs
			IOUtils u1 = new IOUtils("rnd.data");
			IOUtils u2 = new IOUtils("hr.data");
			IOUtils u3 = new IOUtils("sales.data");
			//create the tasks , attach thrds n start them
			DeptHandler task1=new DeptHandler(lists.get(0), u1);
			DeptHandler task2=new DeptHandler(lists.get(1), u2);
			DeptHandler task3=new DeptHandler(lists.get(2), u3);
			Thread t1=new Thread(task1, "rnd");
			Thread t2=new Thread(task2, "hr");
			Thread t3=new Thread(task3, "sales");
			t1.start();t2.start();t3.start();
			System.out.println("waiting for child thrds....");
			t1.join();t2.join();t3.join();
			u1.cleanUp();u2.cleanUp();u3.cleanUp();
			System.out.println("main over....");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
