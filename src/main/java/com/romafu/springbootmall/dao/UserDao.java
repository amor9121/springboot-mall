package com.romafu.springbootmall.dao;

import com.romafu.springbootmall.dto.UserRegisterRequest;
import com.romafu.springbootmall.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
