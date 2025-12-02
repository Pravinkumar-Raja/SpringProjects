package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MessageService;

@RestController
public class UserController {
    
    @Autowired
    private MessageService ms;
//    @Autowired
//    public UserController(MessageService messageService) {
//        this.ms = messageService;
//    }
    @GetMapping("/msg")
    public String meth() {
        return "Message: "+ms.getMessage();  // This should render the message, if you return a String.
    }
}
