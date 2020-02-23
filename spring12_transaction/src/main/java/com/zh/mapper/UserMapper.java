package com.zh.mapper;

import com.zh.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> findAll();

    int add(User user);

    int delete(@Param("id") int id);

}
