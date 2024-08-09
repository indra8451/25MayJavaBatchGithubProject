package com.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class Main {

	public static void main(String[] args) {

		Configuration config = new Configuration();

		config.configure("hibernate.cfg.xml");

		SessionFactory sf = config.buildSessionFactory();

		Session session = sf.openSession();

		Transaction transaction = session.beginTransaction();

		System.out.println("firstTime query: ");
		Query query = session.createQuery("from Student");
		query.setCacheable(true);
		List<Student> studlist = query.list();

		for (Student stud : studlist) {

			System.out.println("ID: " + stud.getId());
			System.out.println("City: " + stud.getCity());
			System.out.println("Mobile: " + stud.getMobile());
			System.out.println("Name: " + stud.getName());
		}

		System.out.println("SecondTime query: ");
		Query query1 = session.createQuery("from Student");
		query1.setCacheable(true);
		List<Student> studlist1 = query1.list();

		for (Student stud : studlist1) {

			System.out.println("ID: " + stud.getId());
			System.out.println("City: " + stud.getCity());
			System.out.println("Mobile: " + stud.getMobile());
			System.out.println("Name: " + stud.getName());
		}

		transaction.commit();
		session.close();

	}

}
