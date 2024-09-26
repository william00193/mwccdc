package com.itccloud.mwccdc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("message", "Hello William");
		
		User user = new User("Output from User Variable defined in index function");
		
		model.addAttribute("user", user);
		return "index-form";
		
	}
	
	@GetMapping("/advance")
	public String advance(Model model) {
		
		List<User> users1 = new ArrayList<User>();
		users1.add(new User("New User 1"));
		users1.add(new User("New User 2"));
		
		model.addAttribute("users1", users1);
	
		return "advance-form";
		
	}
	
	

}
