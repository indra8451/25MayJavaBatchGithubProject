package com;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("op")
public class OperationsOnNumber {
 
	@Value("#{100+20}")
	private int addition;
	
	@Value("#{T(com.Square).square(10)}")  //square(10) is static method so without object we can call fron Suqare class
	private int squareNumber;
	
	@Value("#{8>9}")
	private boolean flag;
	
	@Value("#{oddnumberlist}")
    private List<Integer> oddNumbers;
	
	 @Value("#{employeeMap}")
	 private Map<String, String> employeeNames;

	 @Value("#{skillSet}")
	 private Set<String> skills;

	 @Value("#{configProperties}")
	  private Properties configProperties;

	public int getAddition() {
		return addition;
	}

	public void setAddition(int addition) {
		this.addition = addition;
	}

	public int getSquareNumber() {
		return squareNumber;
	}

	public void setSquareNumber(int squareNumber) {
		this.squareNumber = squareNumber;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public List<Integer> getOddNumbers() {
		return oddNumbers;
	}

	public void setOddNumbers(List<Integer> oddNumbers) {
		this.oddNumbers = oddNumbers;
	}

	public Map<String, String> getEmployeeNames() {
		return employeeNames;
	}

	public void setEmployeeNames(Map<String, String> employeeNames) {
		this.employeeNames = employeeNames;
	}

	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}

	public Properties getConfigProperties() {
		return configProperties;
	}

	public void setConfigProperties(Properties configProperties) {
		this.configProperties = configProperties;
	}

	@Override
	public String toString() {
		return "OperationsOnNumber [addition=" + addition + ", squareNumber=" + squareNumber + ", flag=" + flag
				+ ", oddNumbers=" + oddNumbers + ", employeeNames=" + employeeNames + ", skills=" + skills
				+ ", configProperties=" + configProperties + "]";
	}
	 
	 
}
