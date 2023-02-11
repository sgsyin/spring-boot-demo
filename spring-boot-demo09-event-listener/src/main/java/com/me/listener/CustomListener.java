package com.me.listener;

import com.me.event.CustomEvent;
import org.springframework.context.ApplicationListener;

public class CustomListener implements ApplicationListener<CustomEvent> {

    public void onApplicationEvent(CustomEvent event){
        event.printMessage("CustomListener监听到了");
    }
}
