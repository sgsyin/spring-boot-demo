package com.me.service.impl;

import com.me.dao.GuestDao;
import com.me.domain.Guest;
import com.me.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestDao dao;

    public List<Guest> getAllGuest() {
        return dao.findAll();
    }
}
