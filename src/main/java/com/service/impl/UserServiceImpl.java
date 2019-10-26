package com.service.impl;

import com.dao.UserDao;
import com.domain.User;
import com.service.UserService;

import java.util.List;

/**
 * @author JinLu
 * @date 2019/10/26
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> list() {
        return userDao.findAll();
    }
}
