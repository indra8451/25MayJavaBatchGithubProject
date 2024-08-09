package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Addresseid;
	private String city;
	private String Country;
	private String State;
	private String Pincode;

	public int getAddresseid() {
		return Addresseid;
	}

	public void setAddresseid(int addresseid) {
		Addresseid = addresseid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getPincode() {
		return Pincode;
	}

	public void setPincode(String pincode) {
		Pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [Addresseid=" + Addresseid + ", city=" + city + ", Country=" + Country + ", State=" + State
				+ ", Pincode=" + Pincode + "]";
	}

}
