package com.beans;

public class Address {
	private int pincode;

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + "]";
	}

}
