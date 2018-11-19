package com.app.service;

import java.util.List;

import com.app.pojos.Vendor;

public interface VendorService {
	List<Vendor> listVendors();
	Vendor validateUser(String em,String pass);
	String deleteVendor(int id);
	String registerVendor(Vendor v);
	Vendor getVendorDetails(int id);
	String updateVendor(Vendor v);
}
