package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	// add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	// create a no-arg constructor
	public CricketCoach(){
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	
	public String getEmailAddress() {
		System.out.println("CricketCoach: inside getEmailAddress()");
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setEmailAddress()");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		System.out.println("CricketCoach: inside getTeam()");
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: setTeam()");
		this.team = team;
	}

	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setFortuneService()");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes a day";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
