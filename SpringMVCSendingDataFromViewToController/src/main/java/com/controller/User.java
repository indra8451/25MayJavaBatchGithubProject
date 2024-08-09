package com.controller;

public class User {
	
	private String email;  // Same name as the form field "pass" in the view page(here login.jsp)
	private String name; // Same name as the form field "pass" in the view page(here login.jsp)
	private String pass; // Same name as the form field "pass" in the view page(here login.jsp)
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", pass=" + pass + "]";
	}
	
	
}
