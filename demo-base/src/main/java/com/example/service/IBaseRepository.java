package com.example.service;

import org.springframework.context.annotation.DependsOn;

import java.util.List;
import java.util.Map;


public abstract interface IBaseRepository {

	public abstract void eatFish(Object primaryKey);

}
