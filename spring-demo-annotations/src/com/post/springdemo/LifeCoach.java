package com.post.springdemo;

import org.springframework.stereotype.Component;

@Component
public class LifeCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Say your affirmation out loud.";
	}

}
