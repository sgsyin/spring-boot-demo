package com.me.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServletController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
