package com.example.service;

import com.example.bean.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Component
public class BaseRepositoryImpl implements IBaseRepository {

    @Autowired
	private IElasticsearchBaseRepository elasticsearchBaseRepository;

//	@Autowired
//	public BaseRepositoryImpl(IElasticsearchBaseRepository<T> elasticsearchBaseRepository){
//		this.elasticsearchBaseRepository = elasticsearchBaseRepository;
//	}

	@Override
	public void eatFish(Object primaryKey) {
		String retData = getClass()+" eatFish";
		System.out.println(retData);
		Hero hhh = new Hero();
		elasticsearchBaseRepository.insert();
	}

}
