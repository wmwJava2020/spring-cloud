package com.shopping.ws.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/users")
public class UsersController { //http://localhost:6001/MOBILE-USERS/users/api
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/api")
	public String getAccountServiceStatus() {
		String dateTime = LocalDateTime.now().toString();
		String str = "Users Service Current Time is :";
		return str + dateTime + "  and    PORT NUMBER running is :   "+environment.getProperty("local.server.port");
	}

}
