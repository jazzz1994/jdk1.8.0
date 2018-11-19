package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Vendor;

@Repository
public class VendorDaoImpl implements VendorDao {
	// dependency
	@Autowired
	private SessionFactory sf;

	public VendorDaoImpl() {
		System.out.println("in dao constr");
	}

	@Override
	public Vendor validateUser(String em123, String pass) {
		String jpql = "select v from Vendor v where v.email=:em and v.pass=:pa";

		return sf.getCurrentSession().createQuery(jpql, Vendor.class).setParameter("em", em123).setParameter("pa", pass)
				.getSingleResult();
	}

	@Override
	public List<Vendor> listAllVendors() {
		String jpql = "select v from Vendor v where v.role=:rl";
		return sf.getCurrentSession().createQuery(jpql, Vendor.class).setParameter("rl", "vendor").getResultList();
	}

	@Override
	public Vendor getVendorDetails(int id) {
		
		return sf.getCurrentSession().get(Vendor.class, id);
	}

	@Override
	public String deleteVendorDetails(Vendor v) {
		sf.getCurrentSession().delete(v);
		return "Vendor un-subscribed successfully";
	}

	@Override
	public String registerVendor(Vendor v) {
		sf.getCurrentSession().save(v);
		return "vendor subscribed with ID "+v.getId();
	}

	@Override
	public String updateVendor(Vendor v) {
		sf.getCurrentSession().update(v);
		return "vendor details updated successfully";
	}
	
	
	

}
