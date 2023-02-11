package com.me.listener;

import com.me.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomListener2 implements ApplicationListener<CustomEvent> {

    public void onApplicationEvent(CustomEvent event){
        event.printMessage("CustomListener2监听到了");
    }
}
