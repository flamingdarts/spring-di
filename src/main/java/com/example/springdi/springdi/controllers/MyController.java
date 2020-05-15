package com.example.springdi.springdi.controllers;

import com.example.springdi.springdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        System.out.println("Hello world");
        return greetingService.getGreeting();
    }
}
