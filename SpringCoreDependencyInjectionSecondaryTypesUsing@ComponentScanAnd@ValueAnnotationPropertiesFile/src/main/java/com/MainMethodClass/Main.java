package com.MainMethodClass;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.ComponentsorBeans.Calculator;
import com.ComponentsorBeans.Transaction;
import com.JavaBasedConfigurationClass.AppConfig;

/**
 * The Main class initializes the Spring application context, retrieves beans,
 * and demonstrates the functionality of the Calculator and Addition classes.
 */
public class Main {

	public static void main(String[] args) {

		// Initialize the Spring application context using Java-based configuration
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		// Retrieve the Calculator bean from the Spring context
		Calculator calculator = applicationContext.getBean(Calculator.class);

		// Call the addition method on the Calculator bean, which performs addition and
		// prints the result
		calculator.addition();

		// Retrieve the list of Transaction objects from the Calculator bean
		List<Transaction> tranlist = calculator.getTransactions();

		// Print the list of transactions
		System.out.println("Transactions:");
		for (Transaction transaction : tranlist) {
			System.out.println(transaction);
		}

		// Retrieve and print the employee names from the Addition bean, accessed via
		// the Calculator bean
		System.out.println("Employee Names:");
		System.out.println(calculator.getAddition().getEmployeeNames());

		// Retrieve and print the skills from the Addition bean, accessed via the
		// Calculator bean
		System.out.println("Skills:");
		System.out.println(calculator.getAddition().getSkills());
	}
}
