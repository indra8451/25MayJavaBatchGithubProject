package com.hibernate;

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
	
		Address address =new Address();
		address.setCity("pune");
		address.setCountry("India");
		address.setState("maharastra");
		address.setPincode("525457");
		
		Employee emp= new Employee();
		emp.setName("Philip");
		emp.setEmail("philip@gmail.com");
		emp.setAddress(address);
		
		Employee emp1= new Employee();
		emp1.setName("mahesh");
		emp1.setEmail("mahesh@gmail.com");
		emp1.setAddress(address);
		
		session.save(emp);
		session.save(emp1);
		
		transaction.commit();
		session.close();
		sf.close();
	}

}
