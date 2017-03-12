package com.post.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class ScrumCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Do your daily stand up";
	}

}
