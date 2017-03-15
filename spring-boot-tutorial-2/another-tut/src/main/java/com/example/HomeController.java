package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @RequestMapping("/")
  public String home(){
    return "this is home";
  }

  @RequestMapping("/contact")
  public String contact(){
    return "this is the contacts page";
  }

  @RequestMapping("/about")
  public String about(){
    return "this is the about page";
  }
}
