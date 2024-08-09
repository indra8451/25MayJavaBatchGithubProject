package com.JavaBasedConfigurationClass;

import java.util.*; // Importing necessary collections

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.ComponentsorBeans.Transaction;

@Configuration
@ComponentScan("com.ComponentsorBeans")
/*
 * Scans the specified package for @Component, @Service, @Repository,
 * and @Controller annotations. You can also use arrays in @ComponentScan to
 * specify multiple packages or include specific classes.
 * 
 * @ComponentScan( basePackages = "com.ComponentsorBeans", // Scans the
 * specified package for @Component, @Service, @Repository, and @Controller
 * annotations. basePackageClasses = {SomeClass.class, AnotherClass.class} //
 * Scans the packages containing the specified classes. // You can also use
 * arrays in @ComponentScan to specify multiple packages or include specific
 * classes.
 */
@PropertySource("classpath:application.properties") // Loads properties from the specified file.
public class AppConfig {

	// Define a bean for employeeMap. This method creates a Map<String, String>
	// containing employee IDs and names.
	@Bean
	public Map<String, String> employeeMap() {
		Map<String, String> employeeMap = new HashMap<String, String>();
		employeeMap.put("E001", "John Doe");
		employeeMap.put("E002", "Jane Smith");
		return employeeMap;
	}

	// Define a bean for transaction1. This method creates a Transaction object with
	// preset values.
	@Bean
	public Transaction transaction1() {
		Transaction transaction = new Transaction();
		transaction.setId("1001");
		transaction.setAmount(50000);
		transaction.setDescription("Payment for services");
		return transaction;
	}

	// Define a bean for transaction2. This method creates another Transaction
	// object with different values.
	@Bean
	public Transaction transaction2() {
		Transaction transaction = new Transaction();
		transaction.setId("1002");
		transaction.setAmount(60000);
		transaction.setDescription("Refund for product");
		return transaction;
	}
}
