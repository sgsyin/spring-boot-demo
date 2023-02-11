package com.me.listener;

import com.me.event.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomListener3 {

    @EventListener
    public void onApplicationEvent(CustomEvent event){
        event.printMessage("CustomListener3监听到了");
    }
}
