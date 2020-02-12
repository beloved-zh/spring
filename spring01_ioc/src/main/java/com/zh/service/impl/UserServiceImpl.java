package com.zh.service.impl;

import com.zh.dao.UserDao;
import com.zh.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao dao;

    //利用set实现进行值得注入
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public void getUser() {
        dao.getUser();
    }
}
