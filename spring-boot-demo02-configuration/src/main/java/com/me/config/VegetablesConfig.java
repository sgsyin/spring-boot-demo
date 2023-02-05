package com.me.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * vegetables.potato=土豆
 * vegetables.eggplant=茄子
 * vegetables.greenpeper=青椒
 *
 * @Configuration
 * 声明这是一个配置类,在spring中可以替代xml配置文件
 * @ConfigurationProperties(prefix = "vegetables")
 * 声明这是一个配置文件类,并且声明前缀
 * @PropertySource("classpath:vegetables.properties")
 * 声明文件对于的地址
 */
@Configuration
@ConfigurationProperties(prefix = "vegetables")
@PropertySource("classpath:vegetables.properties")
@Getter@Setter
public class VegetablesConfig {

    private String potato;
    private String eggplant;
    private String greenpeper;
}
