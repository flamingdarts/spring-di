package com.example.springdi.springdi.controllers;

import com.example.springdi.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {
    @Autowired
    public GreetingService greetingService;

    public String greeting() {
        return greetingService.getGreeting();
    }
}
