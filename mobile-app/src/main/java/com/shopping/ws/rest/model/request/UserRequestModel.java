package com.shopping.ws.rest.model.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserRequestModel {

	@NotNull(message = "User name is required to create a New User!")
	@Size(min=3,max=15,message = "Fist name must be more than 2 charchters")
	private String firstName;
	
	@NotNull(message = "User name is required to create a New User!")
	@Size(min=3,max=15,message = "Fist name must be more than 2 charchters")
	private String lastName;
	
	@Email(message = "Email must be valid")
	@Email
	private String email;

	@Size(min=10,max = 30,message ="Password must be 10 character long" )
	@NotNull(message ="Password is required to create new user" )
	private String password;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRequestModel(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserRequest [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + "]";
	}

}
