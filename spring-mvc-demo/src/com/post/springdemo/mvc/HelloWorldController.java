package com.post.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") // high level / parent mapping
public class HelloWorldController {

	// need a controller method to show the initial form
	@RequestMapping("/showForm") // sub path
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
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest req, Model model){
		// read the request parameter from the HTML form
		String theName = req.getParameter("studentName");
		// covert data to all upper case
		theName = theName.toUpperCase();
		// create message
		String result = "Yo! " + theName;
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String theName,
			Model model){
	
		// read the request parameter from the HTML form
		// By adding the @RequestParam bit, the following
		// commented out code is simply not needed anymore!
		// Spring is doing it for us
		// covert data to all upper case
		theName = theName.toUpperCase();
		// create message
		String result = "Hey My Friend! from v3! " + theName;
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
