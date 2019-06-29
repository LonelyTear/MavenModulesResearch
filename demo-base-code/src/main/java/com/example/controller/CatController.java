package com.example.controller;

import com.example.service.ICatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController  {

    @Autowired
    private ICatService catService;

    @GetMapping("/eatFish")
    public String eatFish(){
        String retData = getClass()+" eatFish";
        System.out.println(retData);
        catService.eatFish();
        return retData;
    }
}
