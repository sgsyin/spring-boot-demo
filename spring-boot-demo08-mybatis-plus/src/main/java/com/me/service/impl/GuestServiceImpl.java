package com.me.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.me.domain.Guest;
import com.me.mapper.GuestMappper;
import com.me.service.GuestService;
import org.springframework.stereotype.Service;

@Service
public class GuestServiceImpl extends ServiceImpl<GuestMappper,Guest> implements GuestService {
}
