package insertOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import insertOperation.Student;

public class Main {

	public static void main(String[] args) {
		
		Configuration conf= new Configuration();
		
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory sf=conf.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		
		            Student stud2= new Student();
					stud2.setId(3);
		            stud2.setName("vinu");
		            stud2.setCity("dethe");
		            stud2.setMobile("22222222222");
					session.save(stud2);
		 
		transaction.commit();
		session.close();
		System.out.println("record saved succesfully");
	}

}
