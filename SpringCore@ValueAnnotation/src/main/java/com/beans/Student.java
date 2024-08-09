package com.beans;

import org.springframework.beans.factory.annotation.Autowired;

// For Primitive Data types
public class Student {
	
	private int a;
	private int b;
	
	
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	@Autowired(required=true)
	public void setB(int b) {
		this.b = b;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	
	public void printName() {
		
		System.out.println("value of a "+a);
		System.out.println("value of a "+b);
	}
	
}
