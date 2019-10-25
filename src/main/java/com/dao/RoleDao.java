package com.dao;

import com.domain.Role;

import java.util.List;

/**
 * @author JinLu
 * @date 2019/10/25
 */
public interface RoleDao {
    /**
     * findAll
     * @return
     */
    public List<Role> findAll();
}
