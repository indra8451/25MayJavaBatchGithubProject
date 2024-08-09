package com.beans;

import java.util.Arrays;
import java.util.List;

public class Employee {
	
	private int employeeID;
	private String Name;
	private int salary;
	private List<String> projects;
	private String[] employeeLaptop; // This is an array with a fixed size of 2
	
	
	public Employee(int employeeID, String name, int salary, List<String> projects, String[] employeeLaptop) {
		this.employeeID = employeeID;
		Name = name;
		this.salary = salary;
		this.projects = projects;
		this.employeeLaptop = employeeLaptop;
	}


	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", Name=" + Name + ", salary=" + salary + ", projects=" + projects
				+ ", employeeLaptop=" + Arrays.toString(employeeLaptop) + "]";
	}
	
	
	
}
