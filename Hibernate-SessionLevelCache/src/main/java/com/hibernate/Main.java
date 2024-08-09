package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Configuration config= new Configuration();
		
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf=config.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Student stud=session.get(Student.class, 2);
		System.out.println("Student Info: ");
		System.out.println("ID: "+ stud.getId());
		System.out.println("City: "+stud.getCity());
		System.out.println("Mobile: "+stud.getMobile());
		System.out.println("Name: "+stud.getName());
		
		Student stud2=session.get(Student.class, 2);
		System.out.println("Student Info: ");
		System.out.println("ID: "+ stud2.getId());
		System.out.println("City: "+stud2.getCity());
		System.out.println("Mobile: "+stud2.getMobile());
		System.out.println("Name: "+stud2.getName());		
		transaction.commit();
		session.close();

	}

}
