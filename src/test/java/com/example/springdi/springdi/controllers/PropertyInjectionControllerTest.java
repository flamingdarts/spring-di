package com.example.springdi.springdi.controllers;

import com.example.springdi.springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectionControllerTest {

    PropertyInjectionController propertyInjectionController;

    @BeforeEach
    void setUp(){
        propertyInjectionController = new PropertyInjectionController();
        propertyInjectionController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting(){
        System.out.println(propertyInjectionController.greetingService.getGreeting());
    }
}