package com.post.springdemo;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// We only want to make use of the two beans defined below, so the 
// component scan is commented out
// @ComponentScan("com.post.springdemo") // scans the specified package
public class SportConfig {
	
	// define bean for our sad fortune service
	// method name must be the default bean id
	// of the object we want to return (i.e.
	// first letter is lower case unless first two
	// letters are upper case)
	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	
	// define bean for our spin coach and inject dependency,
	// which spring does for us once specified here, yay
	@Bean
	public Coach spinCoach(){
		return new SpinCoach(sadFortuneService());
	}
}
