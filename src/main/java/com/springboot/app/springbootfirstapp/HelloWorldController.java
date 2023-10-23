package com.springboot.app.springbootfirstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
    // GET HTTP Method
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }
    
}
