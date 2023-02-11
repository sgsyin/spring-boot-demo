package com.me;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.me.tk.mapper")
@MapperScan("com.me.mapper")
public class Demo07Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo07Application.class, args);
    }

}
