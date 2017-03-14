package com.post.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.post.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// start a transaction
			session.beginTransaction();
			
			// query students
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			displayStudents(theStudents);	
			
			// query students: lastName == 'Doe'
			theStudents = session.createQuery("from Student s where s.lastName='Doe'").getResultList();
			
			System.out.println("The students with last name doe: ");
			displayStudents(theStudents);
			
			// query students: lastName == 'Doe' or firstName == 'Daffy'
			theStudents = 
					session.createQuery("from Student s where" +
							" s.lastName='Doe'"
							+ " OR s.firstName='Daffy'").getResultList();
				
			System.out.println("The students with last name doe or first name Daffy: ");
			displayStudents(theStudents);
			
			// query students where email ends with '%example.com'
			theStudents = 
					session.createQuery("from Student s where s.email"
							+ " LIKE '%example.com'").getResultList();
							
			System.out.println("The students with email ending in example.com: ");
			displayStudents(theStudents);
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		// display the students
		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

}
