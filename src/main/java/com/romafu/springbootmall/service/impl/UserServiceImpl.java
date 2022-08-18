package com.romafu.springbootmall.service.impl;

import com.romafu.springbootmall.dao.UserDao;
import com.romafu.springbootmall.dto.UserRegisterRequest;
import com.romafu.springbootmall.model.User;
import com.romafu.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest){
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

}
