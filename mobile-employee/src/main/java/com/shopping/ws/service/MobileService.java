package com.shopping.ws.service;

import java.util.List;

import com.shopping.ws.entity.modle.MobileRequestModle;
import com.shopping.ws.entity.modle.MobileResponseModle;

public interface MobileService {
	
	
	List<MobileResponseModle> getDetails(MobileRequestModle request);

}
