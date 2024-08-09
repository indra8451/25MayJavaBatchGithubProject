package com.MainMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		Student stud = (Student) applicationContext.getBean("s");

		System.out.println("Student INFO: ");
		System.out.println("Student Name: " + stud.getName());
		System.out.println("Student Subject List: " + stud.getSubjectlist());
		System.out.println("Student Subject Set: "+ stud.getSubjectSet());
		System.out.println("Student Subject Map: "+ stud.getSubjectMap());
	}

}

/*output

Student INFO: 
Student Name: Rahul
Student Subject List: [Subject [Name=JAVA], Subject [Name=Python], Subject [Name=ReactJS]]
Student Subject Set: [Subject [Name=JAVA], Subject [Name=Python], Subject [Name=ReactJS]]
Student Subject Map: {subject1=Subject [Name=JAVA], subject2=Subject [Name=Python], subject3=Subject [Name=ReactJS]}
*/