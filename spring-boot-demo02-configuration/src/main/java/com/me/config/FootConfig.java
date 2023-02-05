package com.me.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ConfigurationProperties(prefix = "foot")
 * 声明这是一个配置文件对于的类
 * prefix前缀对于的是配置文件中的一级目录
 */
@ConfigurationProperties(prefix = "foot")
@Data
public class FootConfig {

    private String meat;
    private String rice;
    private String[] sauce;
}
