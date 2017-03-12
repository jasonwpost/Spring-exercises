/*
 * This class demonstrates the field injection
 */

package com.post.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CareerCoach implements Coach {
	
	/*
	 * even though this is private, spring will still set this
	 */
	@Autowired
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Get promoted.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
