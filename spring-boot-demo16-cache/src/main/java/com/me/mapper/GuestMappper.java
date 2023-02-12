package com.me.mapper;

import com.me.domain.Guest;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface GuestMappper {

    @Select("select id,name,role from guest")
    List<Guest> selectAll();

    @Select("select id,name,role from guest where id=#{id}")
    Guest selectById(int id);

    @Update("update guest set id=#{id},name=#{name},role=#{role} where id=#{id}")
    void update(Guest guest);

    @Delete("delete from guest where id=#{id}")
    void delete(int id);

    @Delete("delete from guest")
    void deleteAll();
}
