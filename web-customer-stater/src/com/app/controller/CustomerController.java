package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojo.Customer;
import com.app.service.CustomerService;


@Controller
@RequestMapping("/customer")
public class CustomerController {

	   CustomerController(){
		   System.out.println("in customer controller");
	   }
	   
	   @Autowired
	   private CustomerService custserv;
	  
	     
	   
		@GetMapping("/list")
		public String listCustomers(Model model) {
			
			//get customers from dao
			List<Customer> customers = custserv.listAllCustomers();
			
			//add the customers to the model
			model.addAttribute("customers",customers);
			
			
			return "customer/list";
		}
		
		@GetMapping("/add")
		public String displayRegisterForm(Customer c) {
			return "customer/register";
		}
		
		
		
		@PostMapping("/add")
		public String processRegForm(Customer c) {
			custserv.addCustomer(c);
	     	return "redirect:/customer/list";
		}
		
		@GetMapping("/delete")
		public String deleteCustomer(@RequestParam int cid) {
			
			custserv.deleteCustomer(cid);
			return "redirect:/customer/list";
		}
		
		
		@GetMapping("/update")
		public String showCustomer(@RequestParam int cid, Model model) {
			
			Customer cust = custserv.getCustomerDetails(cid);
			
			model.addAttribute("customer",cust);
			
			return "customer/update";
		}
		
		@PostMapping("/update")
		public String updateCustomer(Customer c) {
			
			custserv.updateCustomer(c);
			
			return "redirect:/customer/list";
		}
		
		@GetMapping("/validate")
		public String showLoginForm(){
			return "customer/login";
		}
		
		@PostMapping("/validate")
		public String validate(@RequestParam String email,@RequestParam String pass ,RedirectAttributes flash) {	
			if(email.equals("admin@gmail") && pass.equals("1234")) {
				
				flash.addFlashAttribute("status", "login Sucessful");
				
			    return "redirect:/customer/list";
			}else {
				
				flash.addFlashAttribute("status","Try again");
				return "redirect:customer/login";
			}
		}
	}

