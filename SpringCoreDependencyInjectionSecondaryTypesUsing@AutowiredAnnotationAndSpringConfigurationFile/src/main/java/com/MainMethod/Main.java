package com.MainMethod;

import java.util.Arrays;

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
		System.out.println("Student Subject Array: " + Arrays.toString(stud.getSubjectArray()) );
		System.out.println("Student Address: "+stud.getAddress());

		System.out.println(stud);
	}

}

/*Student INFO: 
Student Name: Rahul
Student Subject List: [Subject [Name=JAVA], Subject [Name=Python], Subject [Name=ReactJS]]
Student Subject Array: [Subject [Name=JAVA], Subject [Name=Python], Subject [Name=ReactJS]]
Student Address: Address [pincode=4000043]
Student [Name=Rahul, Subjectlist=[Subject [Name=JAVA], Subject [Name=Python], Subject [Name=ReactJS]], subjectArray=[Subject [Name=JAVA], Subject [Name=Python], Subject [Name=ReactJS]], address=Address [pincode=4000043]]
*/