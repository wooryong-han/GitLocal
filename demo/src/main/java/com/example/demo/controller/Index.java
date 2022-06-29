package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {

    @GetMapping("/")
    public String home()
    {
        return "hello world";
    }


}
