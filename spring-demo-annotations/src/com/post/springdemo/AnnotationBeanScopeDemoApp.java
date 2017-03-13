package com.post.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// retrieve bean from spring container
		// default scope is singleton
		// can change scope to prototype through @Scope("prototype")
		// above the class in question, which will create a new instance
		// each time.
		Coach theCoach = context.getBean("careerCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("careerCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		context.close();
	}	

}
