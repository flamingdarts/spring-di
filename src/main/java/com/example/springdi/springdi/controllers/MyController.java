package com.example.springdi.springdi.controllers;

import com.example.springdi.springdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello world");
        return "Hi folks!";
    }
}
