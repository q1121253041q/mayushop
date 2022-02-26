package com.youfan.dao;

import com.youfan.mapper.UserMappper;
import com.youfan.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by youfan on 2018/6/6 0006.
 */
@Component
public class UserDao {

    @Autowired
    UserMappper userMappper;

    public User findUserInfo(){
        return userMappper.findUserInfo();
    }
}
