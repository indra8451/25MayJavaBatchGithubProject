package com.hibernate;

import java.util.Date;

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
		
		 Transection transection = new Transection();  //local class
		 transection.setDate(new Date());
		 transection.setTotal(70000);
		
		Customer customer = new Customer();
		customer.setName("vinu");
		customer.setEmail("vinu@gmail.com");
		customer.setAddress("Pune");
		customer.setTransection(transection);
		
		session.save(customer);
		transaction.commit();
		session.close();
		sf.close();
	}

}
