package com.me.controller;

import com.me.domain.Guest;
import com.me.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService service;

    @GetMapping
    public List<Guest> list(Model model){
        List<Guest> guestList = service.getAllGuest();
        model.addAttribute("guestList",guestList);
        return guestList;
    }

    @GetMapping("/{id}")
    public Guest guest(@PathVariable(name = "id") int id){
        Guest guest = service.getById(id);
        return guest;
    }

    @GetMapping("/update")
    public Guest update(int id,String name,String role){
        Guest newGuest = new Guest(id,name,role);
        return service.update(newGuest);
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(name="id") int id){
        service.delete(id);
        return "Success";
    }

    @GetMapping("/delete")
    public String deleteAll(){
        service.deleteAll();
        return "Success";
    }
}
