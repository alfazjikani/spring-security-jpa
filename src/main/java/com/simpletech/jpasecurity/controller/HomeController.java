package com.simpletech.jpasecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String base() {
		return "index";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@GetMapping("/user")
	public String home() {
		return "user";
	}

	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	
}
