package com.spb.udemy.tuto.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spb.udemy.tuto.security.controller")
public class SpringSecurity01BasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurity01BasicApplication.class, args);
	}

}
