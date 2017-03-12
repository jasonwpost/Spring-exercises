package com.post.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create array of strings
	private String[] data = {
			"Ask later.",
			"Outcome uncertain.",
			"Maybe."
	};
	
	// create random number generator
	public int getRandomIndex(){
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(this.data.length);
		return randomInt;
	}
	
	@Override
	public String getFortune() {
		
		return data[getRandomIndex()];
	}

}
