package com.beans;

public class Subject {

	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Subject [Name=" + Name + "]";
	}

}
