package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        // Create a Configuration instance and configure it with the 'hibernate.cfg.xml' file
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        // Build the SessionFactory from the Configuration
        SessionFactory sf = config.buildSessionFactory();

        // Open a new Session from the SessionFactory
        Session session = sf.openSession();

        // Load a Student entity with ID 2 from the database using the first session
        // 'session.load' is used here; it retrieves the entity from the cache if it exists
        // Otherwise, it will load it from the database
        Student s1 = session.load(Student.class, 2);

        // Print details of the student retrieved
        System.out.println("First session data from SessionFactory Cache>>");
        System.out.println("Name>>" + s1.getName());
        System.out.println("City>>" + s1.getCity());
        System.out.println("Mobile>>" + s1.getMobile());

        // Open another new Session from the same SessionFactory
        // This session is used to demonstrate second-level caching
        System.out.println("Second session data from SessionFactory Cache>>");
        Session session1 = sf.openSession();

        // Load the same Student entity with ID 2 from the database using the second session
        // With proper second-level caching configured, Hibernate should retrieve this from the cache
        Student s3 = session1.load(Student.class, 2);

        // Print details of the student retrieved from the second session
        // If caching is working correctly, these details are retrieved from the cache
        System.out.println("Student data is>>");
        System.out.println("Name>>" + s3.getName());
        System.out.println("City>>" + s3.getCity());
        System.out.println("Mobile>>" + s3.getMobile());

        // Close both sessions to release database connections and other resources
        session.close();
        session1.close();
    }
}
