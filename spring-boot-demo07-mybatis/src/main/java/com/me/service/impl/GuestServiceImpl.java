package com.me.service.impl;

import com.me.domain.Guest;
import com.me.service.GuestService;
import com.me.tk.mapper.GuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestMapper mapper;

    public List<Guest> getAllGuest() {
        return mapper.selectAll();
    }
}
