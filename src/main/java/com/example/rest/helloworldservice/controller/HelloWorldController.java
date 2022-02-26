package com.example.rest.helloworldservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String Greeting()
    {
            return "Hello from Rest Controller : Test";
    }


}
