package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("hero")
public class HeroController {


    @GetMapping("/herotest")
    public String heroTest(){
        return "herotest";
    }
}
