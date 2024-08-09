package com.beans;

public class Policy {
	
	 private String planName; 
	 private int planAmount;
	 
	 
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public int getPlanAmount() {
		return planAmount;
	}
	public void setPlanAmount(int planAmount) {
		this.planAmount = planAmount;
	}
	
	@Override
	public String toString() {
		return "Policy [planName=" + planName + ", planAmount=" + planAmount + "]";
	} 
	 
	 

}
