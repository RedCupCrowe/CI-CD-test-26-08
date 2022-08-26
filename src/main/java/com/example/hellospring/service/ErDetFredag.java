package com.example.hellospring.service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;

@RestController
public class ErDetFredag {

  @GetMapping("/erdetfredag")
  public String udregning(){
    LocalDate dagsdato = LocalDate.now();

    DayOfWeek ugen = dagsdato.getDayOfWeek();

    int ugedagen = ugen.getValue();

    if (ugedagen == 5){
      return "Det er fredag, hiv vodkaen frem.";
    }else{
      return "Nej, det er ikke fredag, frem med antidepressiverne";
    }

  }
}
