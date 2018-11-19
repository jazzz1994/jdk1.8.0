package com.app.core;
import java.text.SimpleDateFormat;
import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	//private static final long serialVersionUID = 1L;
	private String email;
	private String password;
	private double amount;
	private transient Address adr;
	public String getEmail() {
		return email;
	}

	private Date registrationdate;
	private Registration custom;
	public static SimpleDateFormat sdf;
	static{
		
		sdf=new SimpleDateFormat("dd-MM-yyyy");
		
		
	}
	public void assignaddress(String city,String state,String country,String zipcode)
	{
		adr=new Address(city,state,country,zipcode);
		System.out.println(adr);
	}
	public Date getRegistrationdate() {
		return registrationdate;
	}

	public double getAmount() {
		return amount;
	}


	public  String getPassword()
			{
				return password;
			}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customer(String email,double amount,String password,Date registrationdate,Registration custom)
	{
		this.email=email;
		this.amount=amount;
		
		this.password=password;
		this.registrationdate=registrationdate;
		this.custom=custom;
	}
	@Override
	public String toString() {
		return "Customer email=" + email + ", amount=" + amount + ", password=" + password +" ,"+ "registration on=  " + sdf.format(registrationdate)+"registration  "+custom+ "  adr   "+adr;
	}

}

