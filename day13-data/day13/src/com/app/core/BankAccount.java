package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;
import static utils.ValidationUtils.*;

public class BankAccount{
	private int acctId;
	private String name;
	private double balance;
	private Date creationDate;
	private AcType type;
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd/MM/yyyy");
	}

	public BankAccount(int acctId, String name, double balance, Date creationDate, AcType type) {
		super();
		this.acctId = acctId;
		this.name = name;
		this.balance = balance;
		this.creationDate = creationDate;
		this.type = type;
	}
	

	

	@Override
	public String toString() {
		return "BankAccount [acctId=" + acctId + ", name=" + name + ", balance=" + balance + ", creationDate="
				+ sdf.format(creationDate) + ", type=" + type + "]";
	}

	// deposit
	public void deposit(double amt) {
		balance += amt;
	}

	public void withdraw(double amt) throws Exception {
		validateBalance(balance - amt);
		balance -= amt;
	}

	public void transferFunds(BankAccount dest, double amt) throws Exception {
		withdraw(amt);
		dest.deposit(amt);
	}
	
	


	public int getAcctId() {
		return acctId;
	}


	public String getName() {
		return name;
	}


	public double getBalance() {
		return balance;
	}


	public Date getCreationDate() {
		return creationDate;
	}


	public AcType getType() {
		return type;
	}
	public void applyInterest(double rate)
	{
		balance += (balance*rate/100);
	}
	

}
