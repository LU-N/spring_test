package com.dao;

import com.domain.User;

import java.util.List;

/**
 * @author JinLu
 * @date 2019/10/26
 */
public interface UserDao {

    /**
     *  findAll
     *
     * @return
     */
    List<User> findAll();
}
