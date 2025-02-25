package com.example.helloworldapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

@Controller
public class HelloWorldController {
    @GetMapping("/web")
    @ResponseBody
    public String hello() {
        return "Hello from BridgeLabz!(UC1)";
    }

    @GetMapping("/web/message")
    @ResponseBody
    public String message(Model model){
    model.addAttribute("message");
    return "Hello from BridgeLabz!(ModelUC2)";
    }

}
