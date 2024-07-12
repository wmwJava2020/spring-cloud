package com.shopping.ws.service;

import com.shopping.ws.rest.model.request.UpdateUserRequestModel;
import com.shopping.ws.rest.model.request.UserRequestModel;
import com.shopping.ws.rest.model.response.UserResponseModel;

public interface UserService {
	
	UserResponseModel createUser(UserRequestModel create);
	UserResponseModel updateUser(UpdateUserRequestModel request, String userId);

}
