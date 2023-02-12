package com.me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Demo16Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo16Application.class, args);
    }

}
