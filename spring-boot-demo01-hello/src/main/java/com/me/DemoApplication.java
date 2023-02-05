package com.me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication
 * 声明入口类，并且声明是springboot项目
 */
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        //SpringApplication的静态方法，启动springboot程序
        //两个参数：程序的入口类，main方法的参数
        SpringApplication.run(DemoApplication.class,args);
    }
}
