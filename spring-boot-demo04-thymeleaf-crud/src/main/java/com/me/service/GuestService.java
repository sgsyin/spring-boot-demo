package com.me.service;

import com.me.domain.Guest;

import java.util.List;

public interface GuestService {

    List<Guest> getAllGuest();

    void add(Guest guest);

    Guest get(String name);

    void update(Guest guest);

    void delete(String name);
}
