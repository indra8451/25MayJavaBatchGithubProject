package com.ComponentsorBeans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * The Calculator class is a Spring-managed bean that performs operations
 * involving addition and manages a list of transactions.
 */
@Component
public class Calculator {

	// Dependency injected instance of the Addition class
	private Addition addition;

	// List of Transaction objects injected from the Spring context
	private List<Transaction> transactions;

	// Getter for the Addition instance
	public Addition getAddition() {
		return addition;
	}

	// Getter for the list of transactions
	public List<Transaction> getTransactions() {
		return transactions;
	}

	/**
	 * Sets the Addition instance. This method is annotated with @Autowired,
	 * allowing Spring to inject the appropriate bean.
	 * 
	 * @param addition The Addition instance to set
	 */
	@Autowired
	public void setAddition(Addition addition) {
		this.addition = addition;
	}

	/**
	 * Sets the list of Transaction objects. This method is annotated
	 * with @Autowired, allowing Spring to inject the list of transactions.
	 * 
	 * @param transactions The list of Transaction objects to set
	 */
	@Autowired
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	/**
	 * Calls the makeAddition method on the Addition instance, which performs the
	 * addition operation and prints the result.
	 */
	public void addition() {
		addition.makeAddition();
	}
}
