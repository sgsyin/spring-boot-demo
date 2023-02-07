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
}
