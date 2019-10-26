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

    /**
     * save
     * @param user
     */
    Long save(User user);

    /**
     * saveUserRoleRel
     * @param id
     * @param roleIds
     */
    void saveUserRoleRel(Long id, Long[] roleIds);

    /**
     * delUserRoleRel
     * @param userId
     */
    void delUserRoleRel(Long userId);

    /**
     * del
     * @param userId
     */
    void del(Long userId);
}
