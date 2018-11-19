package utils;

public class Account {
	private double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public  void updateBalance(double amount) throws Exception {
		System.out.println("in update :" + Thread.currentThread().getName());
		balance = balance + amount;
		Thread.sleep(5); //user's think time!
		System.out.println("cancelling......");
		balance = balance - amount;
		System.out.println("update over:" + Thread.currentThread().getName());
	}
	public  double getBalance() throws Exception
	{
		System.out.println("in get bal "+Thread.currentThread().getName());
		Thread.sleep(11);
		return balance;
	}

}
