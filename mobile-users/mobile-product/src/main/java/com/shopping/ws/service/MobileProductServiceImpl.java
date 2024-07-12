package com.shopping.ws.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.shopping.ws.product.Products;

@Service
public class MobileProductServiceImpl implements MobileProductService    {

	static List<Products> list = new ArrayList<Products>();
	
	@Override
	public List<Products> getMobileModel()  {
	
		Products p0 = new Products(UUID.randomUUID().toString(),"IPhone",LocalDateTime.now());
		Products p1 = new Products(UUID.randomUUID().toString(),"IPhone",LocalDateTime.now());
		Products p2 = new Products(UUID.randomUUID().toString(),"Ericson",LocalDateTime.now());
		
		list.add(p0);
		list.add(p1);
		list.add(p2);
		
		for(Products pr : list) {
			System.out.println(pr);
		}
	
		return list; 
	}


}
