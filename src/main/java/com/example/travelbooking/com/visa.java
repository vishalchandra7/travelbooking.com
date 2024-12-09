package com.example.travelbooking.com;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController

public class visa {
    @GetMapping("/myvisa")
    public String getData(){
        return "your visa for belgium is approved and valid for 5 years";
    }
}

