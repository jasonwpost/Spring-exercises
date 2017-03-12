package com.luv2code.springdemo;

public class StressfulFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today will have a stressful event";
	}

}
