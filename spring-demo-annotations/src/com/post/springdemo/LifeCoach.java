package com.post.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LifeCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public LifeCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Say your affirmation out loud.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
