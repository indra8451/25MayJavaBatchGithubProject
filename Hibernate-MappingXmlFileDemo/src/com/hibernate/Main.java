package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Configuration conf= new Configuration();
		
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory sf=conf.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Student stud= new Student();
		
		//stud.setId(1);  
		stud.setFirstname("vinu");
		stud.setLastname("dethe");
		session.save(stud);
		session.close();
		System.out.println("Record saved");
		
	}

}
