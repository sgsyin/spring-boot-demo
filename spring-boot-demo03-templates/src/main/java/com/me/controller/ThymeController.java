package com.me.controller;

import com.me.bean.MyBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeController {

    @RequestMapping("/thyme")
    public String thyme(Model model){
        MyBean myBean = new MyBean();
        myBean.setUser("root");
        myBean.setPass("root123");
        model.addAttribute("name","<h1>thymeleaf<h1>");
        model.addAttribute("myBean",myBean);
        return "/thymeleaf/index";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "/thymeleaf/welcome";
    }
}
