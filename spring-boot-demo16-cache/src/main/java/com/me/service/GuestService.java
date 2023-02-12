package com.me.service;

import com.me.domain.Guest;

import java.util.List;

public interface GuestService {

    List<Guest> getAllGuest();

    Guest getById(int id);

    Guest update(Guest guest);

    void delete(int id);

    void deleteAll();
}
