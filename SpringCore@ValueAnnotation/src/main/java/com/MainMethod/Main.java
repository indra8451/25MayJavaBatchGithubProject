	package com.MainMethod;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		Student student =(Student)applicationContext.getBean("stud");
		
		student.printName();
		
	}

}
