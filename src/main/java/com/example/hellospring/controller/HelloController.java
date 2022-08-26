package com.example.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
  @GetMapping("/firstMapping")
  public String firstMapping(){
    return "testAfTemplate";}
  @GetMapping("/")
  public String rootMapping(){
    return "Default Page!";}

  @GetMapping("/parameter")
  public String parameter(@RequestParam String inddata){
    return inddata + "er dagens tekst.";
  }

}




