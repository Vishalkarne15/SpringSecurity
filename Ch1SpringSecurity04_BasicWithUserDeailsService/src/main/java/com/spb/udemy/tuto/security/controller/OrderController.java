package com.spb.udemy.tuto.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@GetMapping("/order")
	public String orderController() {
		return "This Is OrderController Service";
	}
	
}
