package com.example.rest.helloworldservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    String gm="GoodMorning";

    @GetMapping("/hello")
    public String Greeting()
    {
            return "-Hello World from Rest Controller Eclipse Intellj: Lalit";
    }


}
