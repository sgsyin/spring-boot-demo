package com.me.service.impl;

import com.me.domain.Guest;
import com.me.mapper.GuestMappper;
import com.me.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames="guests")
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestMappper mapper;

    public List<Guest> getAllGuest() {
        return mapper.selectAll();
    }

    @Cacheable(key = "#id"/*,condition = "#id>1"*/)
    @Override
    public Guest getById(int id) {
        System.out.println("查询第" + id + "位嘉宾");
        return mapper.selectById(id);
    }

    @CachePut(key = "#guest.id")
    @Override
    public Guest update(Guest guest) {
        System.out.println("更新第" + guest.getId() + "位嘉宾");
        mapper.update(guest);
        return guest;
    }

    @CacheEvict(key = "#id")
    @Override
    public void delete(int id) {
        System.out.println("删除第" + id + "位嘉宾");
        mapper.delete(id);
    }

    @CacheEvict(allEntries = true)
    @Override
    public void deleteAll() {
        System.out.println("删除所有嘉宾");
        mapper.deleteAll();
        int result = 1/0;
    }
}
