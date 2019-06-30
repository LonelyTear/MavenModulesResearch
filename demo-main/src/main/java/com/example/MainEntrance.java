package com.example;

import com.example.selector.EnableElk;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication()
@SpringBootApplication(scanBasePackages = {"com.example"})
//@EnableElk
public class MainEntrance {

    public static void main(String[] args) {
        SpringApplication.run(MainEntrance.class, args);
    }
}
