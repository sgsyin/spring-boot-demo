package com.me.mapper2;

import com.me.domain.Guest;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
public interface GuestMapper2 {

    @Select("select name,role from guest")
    List<Guest> selectAll();
}
