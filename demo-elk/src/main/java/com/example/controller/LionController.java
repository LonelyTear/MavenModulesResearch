package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class LionController {


    @GetMapping("/liontest")
    public String lionTest(){
        return "lionTest";
    }
}