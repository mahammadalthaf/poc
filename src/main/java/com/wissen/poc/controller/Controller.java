package com.wissen.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {


    @GetMapping("welcome")
    public String helloApi(){
        return "Welcome to poc project...";
    }

}
