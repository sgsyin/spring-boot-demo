package com.me.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FTLController {

    @RequestMapping("/ftl")
    public String index(){
        System.out.println("接收到了请求");
        return "index";
    }
}
