package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.VendorDao;
import com.app.pojos.Vendor;

@Service("dao_based_service")
@Transactional
public class VendorServiceDaoBasedImpl implements VendorService {
	
	@Autowired
	private VendorDao dao;

	public VendorServiceDaoBasedImpl() {
		System.out.println("in constr of " + getClass().getName());
	}

	@Override
	public List<Vendor> listVendors() {
		return dao.listAllVendors();
	}

	@Override
	public Vendor validateUser(String em, String pass) {
		// TODO Auto-generated method stub
		return dao.validateUser(em, pass);
	}

	@Override
	public String deleteVendor(int id) {
		Vendor v = dao.getVendorDetails(id);
		if (v != null)
			return dao.deleteVendorDetails(v);
		return "Vendor un-subscription failed";
	}

	@Override
	public String registerVendor(Vendor v) {
		// TODO Auto-generated method stub
		return dao.registerVendor(v);
	}

	@Override
	public Vendor getVendorDetails(int id) {
		// TODO Auto-generated method stub
		return dao.getVendorDetails(id);
	}

	@Override
	public String updateVendor(Vendor v) {
		// TODO Auto-generated method stub
		return dao.updateVendor(v);
	}
	

}
