package com.example.repository;

import com.example.service.IElasticsearchBaseRepository;
import org.springframework.stereotype.Repository;

@Repository("elasticsearchTemplateRepository")
public class ElasticsearchBaseRepositoryImpl implements  IElasticsearchBaseRepository {

    public boolean insert() {
        String retData = getClass()+" eatFish";
        System.out.println(retData);
        return true;
    }
}
