package com.hvt.springbootk8stest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController

public class GreetingController {
    
    @GetMapping("/hi")
    public String sayHi()
    {
        return "Welcome to Docker test";
    }
}
