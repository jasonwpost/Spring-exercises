/*
 * the default identifier for this class is RESTFourtineService
 * as the first two letters are upper case
 */

package com.post.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "";
	}

}
