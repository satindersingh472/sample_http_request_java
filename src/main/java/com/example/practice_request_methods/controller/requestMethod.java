package com.example.practice_request_methods.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/helper")
public class requestMethod {

    @GetMapping()
    public String get_message(){
        return "This is the sample message comes with get random request";

    }


}