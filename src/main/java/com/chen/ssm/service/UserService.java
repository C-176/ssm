package com.chen.ssm.service;

import com.chen.ssm.dao.UserDao;
import com.chen.ssm.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User queryUserByUserId(Integer userId) {
        return userDao.queryUserByUserId(userId);
    }

    public User queryUserByUserName(String name) {
        return userDao.queryUserByUserName(name);
    }

    public Integer insertUser(User user) {
        return userDao.insertUser(user);
    }
}
