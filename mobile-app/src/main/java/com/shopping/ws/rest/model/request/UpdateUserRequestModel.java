package com.shopping.ws.rest.model.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UpdateUserRequestModel {
	
	@NotNull(message = "First name is required to create a New User!")
	@Size(min=3,max=15,message = "First name must be more than 3 charchters")
	private String firstName;
	
	@NotNull(message = "Last name is required to create a New User!")
	@Size(min=3,max=15,message = "Last name must be more than 3 charchters")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
