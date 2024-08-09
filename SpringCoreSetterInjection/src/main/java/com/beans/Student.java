package com.beans;
import java.util.*;

public class Student {
	
	private String name;
	private List<String> mobile;
	private Set<String> Addresslist;
	private Map<String, String> courses;
	
	public Student() {
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getMobile() {
		return mobile;
	}
	public void setMobile(List<String> mobile) {
		this.mobile = mobile;
	}
	public Set<String> getAddresslist() {
		return Addresslist;
	}
	public void setAddresslist(Set<String> addresslist) {
		Addresslist = addresslist;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
}
