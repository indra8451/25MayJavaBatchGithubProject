package com.MainMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Category;

public class Main {

	public static void main(String[] args) {


		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Category category=(Category) applicationContext.getBean("category");
		category.printCategoryData();

	}

}
