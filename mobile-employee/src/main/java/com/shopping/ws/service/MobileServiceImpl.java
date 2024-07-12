package com.shopping.ws.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.shopping.ws.entity.modle.MobileRequestModle;
import com.shopping.ws.entity.modle.MobileResponseModle;
@Service
public class MobileServiceImpl implements MobileService {
	
	List<MobileResponseModle> list;
	
	

	@Override
	public List<MobileResponseModle> getDetails(MobileRequestModle request) {
		
		MobileResponseModle m0 = new MobileResponseModle(UUID.randomUUID(),"Iphone","APPLE",LocalDateTime.now());
		MobileResponseModle m1 = new MobileResponseModle(UUID.randomUUID(),"Samsung","Samsung",LocalDateTime.now());
		MobileResponseModle m2 = new MobileResponseModle(UUID.randomUUID(),"Iphone","APPLE",LocalDateTime.now());
		
		list.add(m0);
		list.add(m1);
		list.add(m2);
	
		for(MobileResponseModle mobile : list) {
			System.out.println(mobile);
		}
		return list;
	}

}
