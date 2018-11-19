package com.app.controller;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Vendor;
import com.app.service.VendorService;
import com.mysql.fabric.Response;

@Controller
@RequestMapping("/vendor")
public class VendorController {
	// auto wiring ---byType
     @Autowired
     @Qualifier("dao_based_service") // byName
     private VendorService service;

	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("in show login form");
		return "/vendor/login"; // forward view : default
	}

	@PostMapping("/login")
	// req param name MUST match with method arg name
	public String processLoginForm(@RequestParam String email, @RequestParam String pass, Model map, HttpSession hs) {
		System.out.println("in process login form");
		Vendor v = null;
		try {
			v = service.validateUser(email, pass);
		} catch (NoResultException e) {
			System.out.println("err in vendor controller " + e);
			map.addAttribute("status", "Invalid Login , pls retry");
			return "/vendor/login";
		}

		// successful login
		// save validated user dtls under session scope
		hs.setAttribute("user_dtls", v);
		// add status in session scope
		hs.setAttribute("status", "Successful Login for " + v.getRole());
		// role based authorization
		if (v.getRole().equals("admin"))
			return "redirect:/vendor/list";
		// response.sendRedirect(response.encodeRedirectURL("/vendor/details"))
		return "redirect:/vendor/details";
	}

	@GetMapping("/details")
	public String showVendorDetails() {
		System.out.println("in show details");
		return "/vendor/details"; // forward view : default
	}

	@GetMapping("/logout")
	public String logMeOut(HttpSession hs, Model map, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("in logout ....");
		// copy user dtls from session scope---> request scope(model attrs)
		map.addAttribute("user_dtls", hs.getAttribute("user_dtls"));
		// discard session
		hs.invalidate();
		response.setHeader("refresh", "3;url=" + request.getContextPath());
		return "/vendor/logout";
	}

	@GetMapping("/list")
	public String listAllVendors(Model map) {
		System.out.println("in list vendors...." + service);
		map.addAttribute("vendor_list", service.listVendors());
		return "/vendor/list";
	}

	// req handling method for deleting vendor dtls
	@GetMapping("/delete")
	public String unsubscribeVendor(@RequestParam int vid, RedirectAttributes flashMap) {
		// adding status of "delete vendor action" under flash scope
		flashMap.addFlashAttribute("status", service.deleteVendor(vid));
		System.out.println("in un-subscribe");
		return "redirect:/vendor/list";
	}

	@GetMapping("/add")
	public String showRegForm(Vendor v) {
		// Vendor v=new Vendor(); invokes getters ,
		// map.addAttribute("vendor",v);
		System.out.println("in show reg form " + v);
		return "/vendor/add"; // forward view : default
	}

	@PostMapping("/add")
	// req param name MUST match with method arg name
	public String processRegForm(Vendor v, RedirectAttributes flashMap) {
		System.out.println("in process reg  form " + v);
		flashMap.addFlashAttribute("status", service.registerVendor(v));
		return "redirect:/vendor/list";
	}

	@GetMapping("/update")
	public String showUpdateForm(@RequestParam int vid, Model map) {
		// fetch vendor details from DB
		Vendor v = service.getVendorDetails(vid);
		System.out.println("in show update form " + v);
		// add vendor details as model attr under Model map
		map.addAttribute("vendor", v);
		return "/vendor/update";
	}

	@PostMapping("/update")
	public String processUpdateForm(Vendor v, RedirectAttributes flashMap) {
		System.out.println("in process update " + v);
		flashMap.addFlashAttribute("status", service.updateVendor(v));
		return "redirect:/vendor/list";
	}

}
