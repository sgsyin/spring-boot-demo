package com.me.service.impl;

import com.me.domain.Guest;
import com.me.mapper.GuestMappper;
import com.me.mapper2.GuestMapper2;
import com.me.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestMappper mapper1;

    @Autowired
    private GuestMapper2 mapper2;

    public List<Guest> getAllGuest() {
        return mapper2.selectAll();
    }
}
