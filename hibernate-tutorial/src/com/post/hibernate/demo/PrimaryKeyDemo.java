package com.post.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.post.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		
		// create session factory
				SessionFactory factory = new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Student.class)
						.buildSessionFactory();
				
				// create session
				Session session = factory.getCurrentSession();
				
				try {
					// use session object to save the Java object
					System.out.println("Creating new Student objects");
					
					// create 3 student objects
					Student tempStudent1 = 
							new Student("John", "Doe", "john@example.com");
					Student tempStudent2 = 
							new Student("Mary", "Public", "mary@example.com");
					Student tempStudent3 = 
							new Student("Bonita", "Applebaum", "bonita@example.com");
					
					// start a transaction
					session.beginTransaction();
					
					// save the student object
					session.save(tempStudent1);
					session.save(tempStudent2);
					session.save(tempStudent3);
					
					// commit the transaction
					session.getTransaction().commit();
					
					System.out.println("Done!");
				} finally {
					factory.close();
				}

	}

}
