package com.example.pls.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Message {

    @GetMapping("/")
    public String displayMessage(){
        return "Hello! Welcome! Glad you found this page!";
    }
}
