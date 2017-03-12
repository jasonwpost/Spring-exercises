package com.post.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WeatherFortuneService implements FortuneService {
	
	@Value("${prediction.one}") 
	private String predictOne;
	
	@Value("${prediction.two}") 
	private String predictTwo;
	
	@Value("${prediction.three}") 
	private String predictThree;
	
	private String[] data = {null, null, null};
	
	private void setData(){
		data[0] = predictOne;
		data[1] = predictTwo;
		data[2] = predictThree;
	}
	
	// create random number generator
	public int getRandomIndex(){
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(this.data.length);
		return randomInt;
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		setData();
		return data[getRandomIndex()];
	}

}
