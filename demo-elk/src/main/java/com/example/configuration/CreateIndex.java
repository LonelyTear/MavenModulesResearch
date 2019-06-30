package com.example.configuration;


import com.example.bean.Hero;
import com.example.service.ICacheService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.annotation.Order;

import java.util.HashMap;
import java.util.Map;


@Configuration
@Order(200)
//@DependsOn("concurrentMapCacheService")
public class CreateIndex implements ApplicationListener<ApplicationEvent>, ApplicationContextAware {
    private static final Logger logger = LoggerFactory.getLogger(CreateIndex.class.getName());

//    @Autowired
//    private ElasticsearchIndexServiceImpl elasticsearchIndexService;

    @Autowired(required = true)
    @Qualifier("concurrentMapCacheService")
    private ICacheService cacheService;

    private static final String cacheName = "ESMetaDataBeans";

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * 扫描Document注解的类，并自动创建索引mapping
     */
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        logger.info("oooooooooooooo "+ (cacheService == null));
//        Map<String, Object> beansWithAnnotationMap = this.applicationContext.getBeansWithAnnotation(ESMetaData.class);
//        beansWithAnnotationMap.forEach((beanName, bean) -> {
//            Map<String, Object> metaDataBeansMap = (Map<String, Object>) cacheService.get(cacheName);
//            if(metaDataBeansMap == null) metaDataBeansMap = new HashMap<>();
//            String classzName = bean.getClass().getName();
//            if(!metaDataBeansMap.containsKey(classzName)) {
//                metaDataBeansMap.put(classzName, bean);
//                cacheService.put(cacheName, metaDataBeansMap);
//            }
//            try {
//                if (!elasticsearchIndexService.exists(bean)) {
//                    elasticsearchIndexService.createIndex(bean);
//                    logger.info("create elasticsearch index {} successful on the start-up server ..", beanName);
//                }
//            } catch (Exception e) {
//                logger.error("create elasticsearch index {} fail on the start-up server ..", beanName, e);
//            }
//        });
    }


    @Bean
    @Order(150)
    @DependsOn("heroElk2")
    public Hero heroElk3() {
        logger.info("hhhhhhhhhhhhhhhhhh");
        Hero h = new Hero();
        return h;
    }

    @Bean
    @Order(100)
    public Hero heroElk2() {
        logger.info("hhhhhhhhhhhhhhhhhh");
        Hero h = new Hero();
        return h;
    }

}