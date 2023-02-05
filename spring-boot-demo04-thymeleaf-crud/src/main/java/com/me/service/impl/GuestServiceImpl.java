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
        return dao.selectAll();
    }

    public void add(Guest guest) {
        dao.add(guest);
    }

    @Override
    public Guest get(String name) {
        return dao.get(name);
    }

    @Override
    public void update(Guest guest) {
        dao.update(guest);
    }

    @Override
    public void delete(String name) {
        dao.delete(name);
    }
}
