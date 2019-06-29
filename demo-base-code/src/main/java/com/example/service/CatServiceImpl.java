package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatServiceImpl implements   ICatService {

    @Autowired
    private IBaseRepository baseComponent;

    public void eatFish(){
        String retData = getClass()+" eatFish";
        System.out.println(retData);
        baseComponent.eatFish("fish");
    }
}