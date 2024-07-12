package com.shopping.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableDiscoveryClient
public class MobileAcctApplication {
	
	@GetMapping("/name")
	public static String getName() {
		return "MobileAcctApplication"; 
	}
	

	public static void main(String[] args) {
		SpringApplication.run(MobileAcctApplication.class, args);
	}

}
