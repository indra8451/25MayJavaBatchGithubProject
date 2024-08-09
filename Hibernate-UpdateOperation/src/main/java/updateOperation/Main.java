package updateOperation;

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
		
		Student stud=session.get(Student.class, 3);
		
		stud.setCity("nagpur");
		stud.setMobile("222222222");
		session.update(stud);
		transaction.commit();
		session.close();
		System.out.println("record updated succesfully");
	}

}
