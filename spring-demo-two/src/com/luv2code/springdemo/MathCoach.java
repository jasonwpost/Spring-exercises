package com.luv2code.springdemo;

public class MathCoach implements Coach {
	
	FortuneService fortuneService;
	
	public MathCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Work on two proofs a day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
