
package deleteOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import deleteOperation.Student;

public class Main {

	public static void main(String[] args) {
		
		Configuration conf= new Configuration();
		
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory sf=conf.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction transaction=session.beginTransaction();

		Student stud=session.get(Student.class, 2);
		session.delete(stud);
		transaction.commit();
		session.close();
		System.out.println("record deleted succesfully");
	}

}
