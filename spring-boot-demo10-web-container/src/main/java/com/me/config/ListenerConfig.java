package com.me.config;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerConfig {

    @EventListener(WebServerInitializedEvent.class)
    public void onserverready(WebServerInitializedEvent event){
        System.out.println("ListenerConfig---当前web容器的实现类："+
                event.getWebServer().getClass().getName());
    }
}
