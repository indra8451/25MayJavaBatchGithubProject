package com.MainMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employee;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		Employee emp = (Employee) applicationContext.getBean("e");

		System.out.println("Employee information: ");
		System.out.println(emp);

	}

}
