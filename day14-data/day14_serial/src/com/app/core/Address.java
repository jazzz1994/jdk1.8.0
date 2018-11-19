package com.app.core;

import java.io.Serializable;

public class Address /*implements Serializable*/{
	/**
	 * 
	 */
//	private static final long serialVersionUID = -1495938258937530773L;
	private String city,state,country,zipCode;

	public Address(String city, String state, String country, String zipCode) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", zipCode=" + zipCode + "]";
	}

	
	
}
