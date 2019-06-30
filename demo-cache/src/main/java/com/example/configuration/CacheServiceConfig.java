package com.example.configuration;

import com.example.component.AppleComponent;
import com.example.component.PealComponent;
import com.example.service.ConcurrentMapCacheServiceImpl;
import com.example.service.ICacheService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.annotation.Order;

@Configuration
//@Order(100)
@ImportResource(locations = {"classpath*:config/service-cache-context.xml"})
public class CacheServiceConfig {

//    @Bean
//    @Order(400)
//    public ICacheService concurrentMapCacheService() {
//        AppleComponent appleComponent = new AppleComponent();
//        PealComponent pealComponent = new PealComponent();
//        ConcurrentMapCacheServiceImpl concurrentMapCacheService = new ConcurrentMapCacheServiceImpl(appleComponent, pealComponent);
//        return concurrentMapCacheService;
//    }

}
