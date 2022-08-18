package com.romafu.springbootmall.service;

import com.romafu.springbootmall.dto.UserLoginRequest;
import com.romafu.springbootmall.dto.UserRegisterRequest;
import com.romafu.springbootmall.model.User;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);
    User getUserById(Integer userId);
    User login(UserLoginRequest userLoginRequest);



}
