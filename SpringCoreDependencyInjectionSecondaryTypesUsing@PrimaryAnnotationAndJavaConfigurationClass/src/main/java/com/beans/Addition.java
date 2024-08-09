package com.beans;

public class Addition {

	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void Makeaddition() {
		int c = a + b;
		System.out.println("Addition is: " + c);
	}

}
