package com.app.service;

import java.util.List;

import com.app.pojo.Customer;

public interface CustomerService {
	
	
	public List<Customer> listAllCustomers();
	
	
	public void addCustomer(Customer c) ;
	
	
	public void deleteCustomer(int cid);
	
	
	public Customer getCustomerDetails(int id);
	
	
	public void updateCustomer(Customer c);
}
