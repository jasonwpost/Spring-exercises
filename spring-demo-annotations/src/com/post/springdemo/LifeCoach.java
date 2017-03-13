/*
 * This class demonstrates method/setter injection
 */

package com.post.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LifeCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	// define a default constructor
	public LifeCoach(){
		System.out.println(">> inside default constructor");
	}
	
	// define a setter method and use setter injection.
	// This also works for any method with dependency injection,
	// which is called 'method injection'. Rather than 'setter 
	// injection'
	@Autowired
	@Qualifier("weatherFortuneService")
	public void setFortuneService(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Say your affirmation out loud.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartUpStuff(){
		System.out.println(">> in doMyStartUpStuff");
	}
	
	// define my destroy method
	// Note that for prototype scoped beans,
	// Spring does not call the Destroy method
	@PreDestroy
	public void doMyCleanUpStuff(){
		System.out.println(">> in doMyCleanUpStuff");
	}
}
