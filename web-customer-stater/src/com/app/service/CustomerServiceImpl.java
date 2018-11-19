package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.*;
import com.app.pojo.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	
		@Autowired
		CustomerDao custdao;

		@Override
		public List<Customer> listAllCustomers() {
			
			return custdao.ListCustomer();
			
		}

		@Override
		public void addCustomer(Customer c) {
			custdao.addCustomer(c);
			
		}

		@Override
		public void deleteCustomer(int cid) {
			
			custdao.deleteCustomer(cid);
			
		}

		@Override
		public Customer getCustomerDetails(int id) {
			
			return custdao.getCustomerDetails(id);
		}

		@Override
		public void updateCustomer(Customer c) {
			
			custdao.updateCustomer(c);
			
		}
		
		
		
		
		
		
		
}
