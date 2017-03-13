package com.post.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showPage(){
		// the bean property stuff in the xml
		// will add a prefix and a suffix
		return "main-menu";
	}
}
