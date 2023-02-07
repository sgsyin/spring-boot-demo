package com.me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.me.tk.mapper")
public class Demo07Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo07Application.class, args);
    }

}
