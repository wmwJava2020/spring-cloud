package com.shopping.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MobileUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileUsersApplication.class, args);
	}

}
