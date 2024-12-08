package com.example.travelbooking.com;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController

public class train {
    @GetMapping("/mytrain")
    public String getData(){
        return "Please book your ticket,Indian Railways";
    }
}
