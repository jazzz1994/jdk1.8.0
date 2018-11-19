package com.app.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
	public TestController() {
		System.out.println("in test controller constr");
	}

	// @RequestMapping(method="get")
	@GetMapping("/flow")
	public String testMe(Model map) {
		System.out.println("in test");
		// map.addAttribute("date",new Date());
		map.addAttribute(new Date());
		return "/test/welcome";
	}
}
