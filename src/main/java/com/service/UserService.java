package com.service;

import com.domain.User;

import java.util.List;

/**
 * @author JinLu
 * @date 2019/10/26
 */
public interface UserService {
    /**
     * list
     * @return
     */
    List<User> list();

    /**
     * save
     * @param user
     * @param roleIds
     */
    void save(User user, Long[] roleIds);

    /**
     * del
     *
     * @param userId
     */
    void del(Long userId);

    /**
     * login
     *
     * @param username
     * @param password
     * @return
     */
    User login(String username, String password);
}
