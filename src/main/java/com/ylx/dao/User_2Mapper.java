package com.ylx.dao;

import com.ylx.model.User_2;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface User_2Mapper {
    @Select("select * from tb_user")
    List<User_2> findAll();
}
