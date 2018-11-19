package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojo.Customer;



@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sf;

	
	public CustomerDaoImpl() {
		System.out.println("customerdao constructor");
	}


	@Override
	public List<Customer> ListCustomer() {
		
		
		String jpql = "select v from Customer v";
		
		return sf.getCurrentSession().createQuery(jpql, Customer.class).getResultList();
		

	}


	
	@Override
	public void addCustomer(Customer c) {
		
		sf.getCurrentSession().save(c); 
		
	}
	
	
	@Override
	public void deleteCustomer(int cid) {
		
		
		sf.getCurrentSession().delete(getCustomerDetails(cid)); 
		
	}
	

	@Override
	public Customer getCustomerDetails(int id) {
		
		return sf.getCurrentSession().get(Customer.class, id);
	}


	@Override
	public void updateCustomer(Customer c) {
		
		sf.getCurrentSession().saveOrUpdate(c);
		
		
	}

	
	
	
	
}
