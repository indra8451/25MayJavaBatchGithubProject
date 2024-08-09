package com.beans.MultipleBeansOfSameClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/beans/MultipleBeansOfSameClass/spring.xml");
		Calculator addcal = (Calculator) applicationContext.getBean("calculator", Calculator.class);

		addcal.addition();
	}

}
