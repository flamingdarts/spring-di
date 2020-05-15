package com.example.springdi.springdi.controllers;

import com.example.springdi.springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectionControllerTest {

    SetterInjectionController setterInjectionController;

    @BeforeEach
    void setUp() {
        setterInjectionController = new SetterInjectionController();
        setterInjectionController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjectionController.getGreeting());;
    }
}