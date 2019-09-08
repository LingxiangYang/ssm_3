package com.ylx.service.impl;

import com.ylx.dao.User_2Mapper;
import com.ylx.model.User_2;
import com.ylx.service.User_2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("User_2Service")
public class User_2ServiceImpl implements User_2Service {
    @Autowired
    User_2Mapper user_2Mapper;
    @Override
    public List<User_2> getAll() {
        return user_2Mapper.findAll();
    }
}
