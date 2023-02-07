package com.me.mapper;

import com.me.domain.Guest;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
public interface GuestMappper {

    @Select("select name,role from guest")
    List<Guest> selectAll();
}
