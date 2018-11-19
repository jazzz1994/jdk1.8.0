package com.app.core;
import java.io.Serializable;
public class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String city;
	private String state;
	private String company;
	private String zipcode;
	public Address(String city, String state, String company, String zipcode) {
		super();
		this.city = city;
		this.state = state;
		this.company = company;
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", company=" + company + ", zipcode=" + zipcode + "]";
	}
	

}
