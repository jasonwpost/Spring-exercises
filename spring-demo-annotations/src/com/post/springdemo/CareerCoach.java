/*
 * This class demonstrates field injection
 */

package com.post.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CareerCoach implements Coach {
	
	/*
	 * even though this is private, spring will still set this
	 */
	@Autowired
	@Qualifier("happyFortuneService")
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
