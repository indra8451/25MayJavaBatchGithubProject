package retriveOperation;

import java.util.List;
 import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import retriveOperation.Student;

public class Main {

	public static void main(String[] args) {
		
		Configuration conf= new Configuration();
		
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory sf=conf.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction transaction=session.beginTransaction();

		Query query=session.createQuery("from Student");
		List<Student> studlist=query.list();
		
		for(Student stud:studlist) {
			
			System.out.println("ID: "+ stud.getId());
			System.out.println("City: "+stud.getCity());
			System.out.println("Mobile: "+stud.getMobile());
			System.out.println("Name: "+stud.getName());
		}
		
		transaction.commit();
		session.close();
		
	}

}
