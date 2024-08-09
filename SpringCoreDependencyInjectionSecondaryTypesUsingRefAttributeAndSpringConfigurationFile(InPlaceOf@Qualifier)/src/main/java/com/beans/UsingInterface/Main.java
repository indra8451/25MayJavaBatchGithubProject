package com.beans.UsingInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.UsingInterface.Zoo;



public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/beans/UsingInterface/spring.xml");
		Zoo zoo=(Zoo)applicationContext.getBean("zoo");
		zoo.makeSound();

	}

}
