package com.app.dao;
import java.util.List;

import com.app.pojo.*;

public interface CustomerDao {
	
	public List<Customer> ListCustomer();
	
	public void addCustomer(Customer c);
	
	public void deleteCustomer(int cid);
	
	public Customer getCustomerDetails(int id);
	
	public void updateCustomer(Customer c);

}
