package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("path")
public class PathController {

  @RequestMapping("/")
  public String path(){
    return "this is the path home";
  }

  @RequestMapping("/deeper")
  public String deeper(){
    return "this is a deeper path";
  }

  @RequestMapping("/anotherdeeper")
  public String anotherdeeper(){
    return "this is another deep path";
  }
}
