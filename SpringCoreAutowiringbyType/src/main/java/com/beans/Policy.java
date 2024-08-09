package com.beans;

public class Policy {
	
	 private String planName; 
	 private int planAmount;
	 
	 
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public void setPlanAmount(int planAmount) {
		this.planAmount = planAmount;
	}

	public String getPlanName() {
		return planName;
	}

	public int getPlanAmount() {
		return planAmount;
	}


	@Override
	public String toString() {
		return "Policy [planName=" + planName + ", planAmount=" + planAmount + "]";
	} 
	 
	 

}
