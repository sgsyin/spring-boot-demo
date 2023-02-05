package com.me;

import com.me.config.FootConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @SpringBootApplication
 * 声明入口类,并说明是springboot项目
 *
 * @EnableConfigurationProperties({FootConfig.class})
 * 告知主程序入口类,要自动引入配置文件
 * 配置文件对于的类作为参数
 */
@SpringBootApplication
@EnableConfigurationProperties({FootConfig.class})
public class DemoApplication {
    public static void main(String[] args) {
        //SpringApplication的静态方法,启动springboot程序
        SpringApplication.run(DemoApplication.class,args);
    }
}
