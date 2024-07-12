package com.shopping.ws.shared;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class Util {
	
	public String generateUUID() {
	return UUID.randomUUID().toString();
	
	}

}
