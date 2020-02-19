package com.simpletech.jpasecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.simpletech.jpasecurity.bean.UserDetail;
import com.simpletech.jpasecurity.repository.UserRepository;

@Controller
public class HomeController {
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/")
	public String base() {
		UserDetail userDetailObj = userRepo.findByUsername("user");
		System.out.println(userDetailObj);
		return "index";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@PostMapping("/welcome")
	public String postWelcome() {
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
