package tasks;

import java.util.List;

import com.app.core.Emp;

import utils.IOUtils;

public class DeptHandler implements Runnable {
	private IOUtils u;
	private List<Emp> list;

	public DeptHandler(List<Emp> list, IOUtils u) {
		this.list = list;
		this.u = u;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			// list.forEach(u::writeEmpData);
			list.forEach(e -> u.writeEmpData(e));
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");
	}

}
