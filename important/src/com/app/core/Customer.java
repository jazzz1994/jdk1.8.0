package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.SimpleAttributeSet;

public class Customer implements java.lang.Comparable<Customer>
{
private String email;
private String password;
private double regAmount;
private Date date;
 public static SimpleDateFormat sdf;

static{
	
	sdf=new SimpleDateFormat("dd-mm-yyyy");
	
}
public Customer(String email, String password, double regAmount,Date date) {
	super();
	this.email = email;
	this.password = password;
	this.regAmount = regAmount;
	
}
public Customer(String email) 
{	this.email = email;
	}


public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

public double getRegAmount() {
	return regAmount;
}
public void setRegAmount(double regAmount) {
	this.regAmount = regAmount;
}
@Override
public String toString() {
	return "Customer [email=" + email + ", password=" + password + ", regAmount=" + regAmount +", date="+date +"]";
}

public String getEmail() {
	return email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public boolean equals(Object obj) {
	return email.equals(((Customer)obj).email);
}
@Override
public int compareTo(Customer em) {
	return email.compareTo(em.email);
}
}