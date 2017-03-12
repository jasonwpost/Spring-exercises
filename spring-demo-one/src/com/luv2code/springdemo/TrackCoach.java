package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	
	public TrackCoach(){
		// To do
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartUpStuff(){
		System.out.println("TrackCoach: inside method doMyStartUpStuff");
	}
	
	// add a destroy method
	public void doMyCleanUpStuff(){
	System.out.println("TrackCoach: inside method doMyCleanUpStuff");
	}
}
