package com.me.controller;

import com.me.domain.Guest;
import com.me.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService service;

    @GetMapping
    public String list(Model model){
        List<Guest> guestList = service.getAllGuest();
        model.addAttribute("guestList",guestList);
        return "list";
    }

    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @PostMapping
    public String add(Guest guest){
        service.add(guest);
        return "redirect:/guest";
    }

    /**
     *将/guest/toUpdate/{name}格式的url映射到此方法上
     * 其中的name为属性值，通过@PathVariable("name")映射到属性中
     * 其中的”name“代表去url查找属性值
     * 直译的意思是：从路径中获取name的值
     * @param model
     * @param name
     * @return
     */
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name){
        Guest guest = service.get(name);
        model.addAttribute("guest",guest);
        return "update";
    }

    @PutMapping
    public String update(Guest guest){
        service.update(guest);
        return "redirect:/guest";
    }

    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        service.delete(name);
        return "redirect:/guest";
    }
}
