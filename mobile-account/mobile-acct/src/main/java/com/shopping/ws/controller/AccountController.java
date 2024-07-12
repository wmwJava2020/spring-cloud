package com.shopping.ws.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acct")
public class AccountController {
	
	@GetMapping("/api")
	public String getAccountServiceStatus() {
		String dateTime = LocalDateTime.now().toString();
		String str = "Account Service Current Time is :";
		return str + dateTime;
	}

}