package com.post.springdemo;

import org.springframework.stereotype.Component;

//no explicit component name = default id, which is scrumCoach. 
// explicit component name is styled as @Component("componentNameHere")
@Component 
public class ScrumCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Do your daily stand up";
	}

}
