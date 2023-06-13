package com.example.demo.entities;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	@NotBlank(message = "Username is required")
	@Size(min = 4, max = 50, message = "Username must be between 4 and 50 characters")
	private String username;

	@NotBlank(message = "Password is required")
	@Size(min = 8, max = 100, message = "Password must be between 8 and 100 characters")
	private String password;

	@NotBlank(message = "Email is required")
	@Email(message = "Invalid email format")
	private String email;

	@NotBlank(message = "Contact is required")
	@Pattern(regexp = "(\\d{10})", message = "Invalid contact number")
	private String contact;

	@NotBlank(message = "City is required")
	@Size(min = 2, max = 50, message = "City name must be between 2 and 50 characters")
	private String city;

	@NotBlank(message = "Zip code is required")
	@Pattern(regexp = "(\\d{6})", message = "Invalid zip code")
	private String zip;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Customer [username=" + username + ", password=" + password + ", email=" + email + ", contact=" + contact
				+ ", city=" + city + ", zip=" + zip + "]";
	}

}
