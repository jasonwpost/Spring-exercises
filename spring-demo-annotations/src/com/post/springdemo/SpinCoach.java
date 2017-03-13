package com.post.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SpinCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// field level injection
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SpinCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Cycle cycle cycle!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
