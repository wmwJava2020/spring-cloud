package com.shopping.ws.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.ws.rest.model.request.UpdateUserRequestModel;
import com.shopping.ws.rest.model.request.UserRequestModel;
import com.shopping.ws.rest.model.response.UserResponseModel;
import com.shopping.ws.shared.Util;
@Service
public class UserServiceImpl implements UserService {
	
	Map<String, UserResponseModel> users;
	
	private Util util;
	
	@Autowired
	public UserServiceImpl(Util util) {
		this.util = util;
	}



	@Override
	public UserResponseModel createUser(UserRequestModel request) {
		
		UserResponseModel re = new UserResponseModel();
		
		re.setFirstName(request.getFirstName());
		re.setLastName(request.getLastName());
		re.setEmail(request.getEmail());

		String userId = util.generateUUID();
		re.setUserId(userId);

		if (users == null)
			users = new HashMap<>();
		users.put(userId, re);
		
		return re;
	}

	@Override
	public UserResponseModel updateUser(UpdateUserRequestModel request, String userId) { 
		
		UserResponseModel updates = users.get(userId); // get user by user ID
		
		updates.setFirstName(request.getFirstName());
		updates.setLastName(request.getLastName());
		
		if (users == null)
			users = new HashMap<>();
		users.put(userId, updates);

		return updates;
	}

}