package com.shopping.ws.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.ws.product.Products;
import com.shopping.ws.service.MobileProductService;

@RestController
@RequestMapping("/api")
public class MobileProduct {
	
	@Autowired
	MobileProductService service;
	
	@GetMapping("/prs")
	public List<Products> getListOfProducts(){
		
		return service.getMobileModel();
		
	}

}