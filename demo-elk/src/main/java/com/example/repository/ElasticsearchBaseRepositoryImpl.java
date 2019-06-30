package com.example.repository;

import com.example.service.IElasticsearchBaseRepository;
import org.springframework.stereotype.Repository;

@Repository("elasticsearchBaseRepositoryImpl")
public class ElasticsearchBaseRepositoryImpl implements  IElasticsearchBaseRepository {

    public ElasticsearchBaseRepositoryImpl() {
        System.out.println(getClass()+" init$$$");
    }

    public boolean insert() {
        String retData = getClass()+" eatFish";
        System.out.println(retData);
        return true;
    }
}
