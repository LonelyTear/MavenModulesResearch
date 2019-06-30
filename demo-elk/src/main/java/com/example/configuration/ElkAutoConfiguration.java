package com.example.configuration;

import com.example.bean.Hero;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.example")
public class ElkAutoConfiguration {

    @Bean
    public Hero heroElk() {
        Hero h = new Hero();
        return h;
    }
}
