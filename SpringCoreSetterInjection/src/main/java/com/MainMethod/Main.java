package com.MainMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.beans.Student;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		Student student = (Student) applicationContext.getBean("stud");
		System.out.println("Student Info: ");
		System.out.println("Student name: " + student.getName());
		System.out.println("Student mobile: " + student.getMobile());
		System.out.println("Student Addrress: " + student.getAddresslist());
		System.out.println("Student Courses: " + student.getCourses());

	}
}
