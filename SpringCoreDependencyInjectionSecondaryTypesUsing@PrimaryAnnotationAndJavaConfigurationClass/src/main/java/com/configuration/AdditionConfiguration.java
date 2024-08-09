package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.beans.Addition;
import com.beans.Calculator;

/* @Configuration Indicates that a class declares one or more @Bean methods and may be processed by the Spring container 
  to generate bean definitions and service requests for those beans at runtime.*/

@Configuration
public class AdditionConfiguration {

	@Bean(name = "add1")
	public Addition add1() {
		Addition addition = new Addition();
		addition.setA(40);
		addition.setB(50);
		return addition;
	}

	@Bean(name = "add2")
	public Addition add2() {
		Addition addition = new Addition();
		addition.setA(4);
		addition.setB(5);
		return addition;
	}

	@Bean(name = "add3")
	public Addition add3() {
		Addition addition = new Addition();
		addition.setA(555);
		addition.setB(555);
		return addition;
	}

	@Bean(name = "add13")
	@Primary						//set add13  as default bean
	public Addition add13() {
		Addition addition = new Addition();
		addition.setA(78);
		addition.setB(2);
		return addition;
	}

	@Bean(name = "add15")
	public Addition add15() {
		Addition addition = new Addition();
		addition.setA(1);
		addition.setB(21);
		return addition;
	}

	@Bean(name = "calculator")
	public Calculator calculator() {
		return new Calculator();
	}
}
