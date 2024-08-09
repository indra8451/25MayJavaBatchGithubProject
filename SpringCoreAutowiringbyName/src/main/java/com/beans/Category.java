package com.beans;

public class Category {
	
	private String name;
	private Policy policy;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	
	public void printCategoryData() {
		System.out.println("Category Name: "+ this.getName());
		System.out.println("Policy name: "+ policy.getPlanName());
		System.out.println("Policy Amount: "+ policy.getPlanAmount());
	}
	@Override
	public String toString() {
		return "Category [name=" + name + ", policy=" + policy + "]";
	}
	
	

}
