package com.me;

import com.me.listener.CustomListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo09Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Demo09Application.class, args);
        context.addApplicationListener(new CustomListener());
    }
}
