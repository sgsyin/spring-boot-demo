package com.me.mapper;

import com.me.domain.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestDao extends JpaRepository<Guest,Long> {}
