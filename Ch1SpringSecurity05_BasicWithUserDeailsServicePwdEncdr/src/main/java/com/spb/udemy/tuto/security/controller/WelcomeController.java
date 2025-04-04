package com.spb.udemy.tuto.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//With-Out Security
@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome() {
		System.out.println("Welcome In Spring Security With Our Security");
		return "Welcome In Spring Security With Our Security";
	}
	
}
