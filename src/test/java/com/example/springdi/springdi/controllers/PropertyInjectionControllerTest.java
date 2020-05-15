package com.example.springdi.springdi.controllers;

import com.example.springdi.springdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectionControllerTest {

    PropertyInjectionController propertyInjectionController;

    @BeforeEach
    void setUp(){
        propertyInjectionController = new PropertyInjectionController();
        propertyInjectionController.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting(){
        System.out.println(propertyInjectionController.greetingService.getGreeting());
    }
}