package com.me;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.me.mapper")
public class Demo08Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo08Application.class, args);
    }

}
