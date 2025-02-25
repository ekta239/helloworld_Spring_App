package com.example.helloworldapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestcontroller {
    @RequestMapping("/")
    public String index() {
        return "Hello from BridgeLabz!(RestControllerUC3)";
    }
}
