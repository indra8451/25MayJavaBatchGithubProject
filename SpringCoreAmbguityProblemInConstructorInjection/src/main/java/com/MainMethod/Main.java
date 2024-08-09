package com.MainMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Addition;

public class Main {
	
	public static void main(String[] args) {
		
			
			ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		
			Addition add=(Addition)applicationContext.getBean("addition");
			
			add.displayValues();
			int c =add.getSum();
			System.out.println("Addition is: " +  c);
			
	}

}
