package com.app.core;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4466933740819724335L;
	private String email, password;
	private double regAmount;
	private Date regDate;

	public User(String email, String password, double regAmount, Date regDate) {
		super();
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", regAmount=" + regAmount + ", regDate=" + regDate
				+ "]";
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public double getRegAmount() {
		return regAmount;
	}

	public Date getRegDate() {
		return regDate;
	}

/*	@Override
	public boolean equals(Object o) {
		if (o instanceof User)
			return email.equals(((User) o).email);
		return false;
	}
	@Override
	public int hashCode()
	{
		return 23*email.hashCode();
	}*/
	

}
