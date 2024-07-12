package com.shopping.ws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.ws.entity.modle.MobileRequestModle;
import com.shopping.ws.entity.modle.MobileResponseModle;
import com.shopping.ws.service.MobileService;

@RestController
@RequestMapping("/api")
public class MobileController {
	
	@Autowired
	MobileService service;
	
	@GetMapping("/{id}")
	public List<MobileResponseModle> getMobileDetails(@PathVariable("/code") int code, @RequestBody MobileRequestModle request){
		
		List<MobileResponseModle> value = service.getDetails(request);
		
		return value;
		
	}

}
