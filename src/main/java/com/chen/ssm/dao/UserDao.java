package com.chen.ssm.dao;

import com.chen.ssm.po.User;


public interface UserDao {
    public User queryUserByUserId(Integer id);

    public User queryUserByUserName(String name);

    public Integer insertUser(User user);
}
