package com.post.springdemo;

public class SpinCoach implements Coach {
	
	private FortuneService fortuneService;
	
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

}
