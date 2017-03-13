package com.post.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	// need a controller method to show the initial form
	@RequestMapping("/showForm")
	public String showForm(){
		// pre and post fixes will be added through the
		// spring-mvc-demo xml doc in view/
		return "helloworld-form";
	}
	
	// need a controller method to process the form
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
	}
}
