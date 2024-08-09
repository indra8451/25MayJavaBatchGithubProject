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
	
			//take 2 pf account
		
		PFAccount pf= new PFAccount();
		pf.setName("Kiran");
		pf.setCompanyname("TCS");
		
		PFAccount pf1= new PFAccount();
		pf1.setName("Vishal");
		pf1.setCompanyname("Infosys");
		
		//take 3 Nominee 
		
		Nominee nom= new Nominee();
		nom.setName("Mother");
		
		Nominee nom1= new Nominee();
		nom1.setName("Brother");
		
		Nominee nom2= new Nominee();
		nom2.setName("Father");
		
		//one pfccount has many nominees
		pf.getNomineeList().add(nom);
		pf.getNomineeList().add(nom1);
		pf.getNomineeList().add(nom2);
		
		//many nominees has one pfAccount
		nom.getPfaccountlist().add(pf);
		nom1.getPfaccountlist().add(pf);
		
		//one pfccount has many nominees
		pf1.getNomineeList().add(nom);
		pf1.getNomineeList().add(nom1);
		pf1.getNomineeList().add(nom2);
		
		//many nominees has one pfAccount
		nom.getPfaccountlist().add(pf);
		nom1.getPfaccountlist().add(pf1);
		
		session.save(pf);
		session.save(pf1);
		transaction.commit();
		session.close();
		sf.close();
	}

}
