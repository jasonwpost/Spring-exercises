/*
 * Choose a style of injection and stay consistent. 
 */

package com.post.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpinJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		// using the default beanId means just using the name of the class
		// with the first letter as lower case
		SpinCoach theCoach = context.getBean("spinCoach", SpinCoach.class);
		
		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("Email: " + theCoach.getEmail());
		
		System.out.println("Team: " + theCoach.getTeam());
		
		// close the context
		context.close();
	}

}
