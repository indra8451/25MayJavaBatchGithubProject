package com.beans;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private String Name;
	private List<Subject> Subjectlist; // List of subjects
	private Subject[] subjectArray;    // Array of subjects
	private Address address;           //Address reference

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Subject> getSubjectlist() {
		return Subjectlist;
	}

	// `@Autowired` is used to let Spring inject the list of subjects automatically.
	@Autowired
	public void setSubjectlist(List<Subject> subjectlist) {
		Subjectlist = subjectlist;
	}

	public Subject[] getSubjectArray() {
		return subjectArray;
	}

	// `@Autowired` here lets Spring inject the array of subjects automatically.
	@Autowired
	public void setSubjectArray(Subject[] subjectArray) {
		this.subjectArray = subjectArray;
	}

	public Address getAddress() {
		return address;
	}

	// `@Autowired` here lets Spring inject the Address bean automatically.
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	// Overridden `toString` method to give a meaningful representation of the object.
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Subjectlist=" + Subjectlist + ", subjectArray="
				+ Arrays.toString(subjectArray) + ", address=" + address + "]";
	}

}
