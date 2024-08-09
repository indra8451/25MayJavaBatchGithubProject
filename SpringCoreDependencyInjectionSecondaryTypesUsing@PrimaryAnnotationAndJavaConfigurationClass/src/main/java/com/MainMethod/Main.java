package com.MainMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.beans.Calculator;
import com.configuration.AdditionConfiguration;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AdditionConfiguration.class);

		Calculator addcal = (Calculator) applicationContext.getBean("calculator", Calculator.class);

		// Call the 'addition' method on the Calculator bean
		addcal.addition();
	}
}
