package com.hibernate;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {

	public static void main(String[] args) {
	
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		
		User user= new User();
		Policy p1= new Policy(8000, "Active", "home", user);
		Policy p2= new Policy(8001, "inActive", "mobile inssurensce", user);
	
		HashSet<Policy> hashset= new HashSet<Policy>();
		hashset.add(p1);
		hashset.add(p2);
		
		
		user.setName("raju");
		user.setEmail("raju@gmail.com");
		user.setPolicy(hashset);
		
		
		session.save(user);
		session.save(p1);
		session.save(p2);
		transaction.commit();
		
		
		session.close();
		sf.close();
	}

}
