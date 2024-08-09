package com.ComponentsorBeans;

/*To inject multiple instances of the Transaction class into a list in the Calculator class, 
you need to define multiple beans of Transaction in the Spring configuration. 
This is why we didn't use the @Component annotation for Transaction 
because the @Component annotation creates a single bean instance, and 
we need multiple beans.*/

public class Transaction {

	private String id;
	private double amount;
	private String description;

	// Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Transaction{id='" + id + "', amount=" + amount + ", description='" + description + "'}";
	}

}
