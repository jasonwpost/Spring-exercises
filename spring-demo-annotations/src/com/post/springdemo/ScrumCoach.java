/*
 * This class demonstrates constructor injection
 */

package com.post.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// no explicit component name = default id, which is scrumCoach. 
// explicit component name is styled as @Component("componentName")
@Component 
public class ScrumCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public ScrumCoach(@Qualifier("happyFortuneService")
	FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do your daily stand up";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
