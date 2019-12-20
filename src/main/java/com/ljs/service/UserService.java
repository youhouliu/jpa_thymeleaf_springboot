package com.ljs.service;

import com.ljs.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void saveUser(User user);
}
