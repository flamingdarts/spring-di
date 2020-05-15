package com.example.springdi.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary // if no Qualifiers set in DI than this will be the primary bean for GreetingService
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello World! - From the PRIMARY Bean";
    }
}
