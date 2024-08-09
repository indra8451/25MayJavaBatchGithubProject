package com.ComponentsorBeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * The Addition class is a Spring-managed bean that performs basic arithmetic
 * operations and manages lists, maps, and sets of data injected from
 * configuration properties.
 */
@Component
public class Addition {

	// Injects the value for 'a' from application properties
	@Value("${addition.a}")
	private int a;

	// Injects the value for 'b' from application properties
	@Value("${addition.b}")
	private int b;

	// Injects a list of odd numbers from the 'addition.oddnumbers' property.
	// The property value is split by commas and converted to a List of Integers.
	@Value("#{'${addition.oddnumbers}'.split(',')}")
	private List<Integer> oddNumbers;

	// Injects a map of employee names from the 'employeeMap' property defined in a
	// configuration file.
	@Value("#{employeeMap}")
	private Map<String, String> employeeNames;

	// Injects a set of skills from the 'skillSet' property.
	// The property value is split by commas and converted to a Set of Strings.
	@Value("#{'${skillSet}'.split(',')}")
	private Set<String> skills;

	// Getter for 'a'
	public int getA() {
		return a;
	}

	// Setter for 'a'
	public void setA(int a) {
		this.a = a;
	}

	// Getter for 'b'
	public int getB() {
		return b;
	}

	// Setter for 'b'
	public void setB(int b) {
		this.b = b;
	}

	// Getter for the list of odd numbers
	public List<Integer> getOddNumbers() {
		return oddNumbers;
	}

	// Setter for the list of odd numbers
	public void setOddNumbers(List<Integer> oddNumbers) {
		this.oddNumbers = oddNumbers;
	}

	// Getter for the employee names map
	public Map<String, String> getEmployeeNames() {
		return employeeNames;
	}

	// Setter for the employee names map
	public void setEmployeeNames(Map<String, String> employeeNames) {
		this.employeeNames = employeeNames;
	}

	// Getter for the set of skills
	public Set<String> getSkills() {
		return skills;
	}

	// Setter for the set of skills
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}

	/**
	 * Performs addition of 'a' and 'b' and prints the result along with the values
	 * of 'a' and 'b'.
	 */
	public void makeAddition() {
		int c = a + b;
		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
		System.out.println("Addition is: " + c);
	}
}
