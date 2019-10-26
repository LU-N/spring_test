package com.service.impl;

import com.dao.RoleDao;
import com.dao.UserDao;
import com.domain.Role;
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

    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<User> list() {
        List<User> userList = userDao.findAll();
        //封装userList中的每一个User的roles数据
        for (User user : userList) {
            //获得User的id
            Long id = user.getId();
            //作为id的参数 查询当前userId对应的Role集合数据
            List<Role> roles = roleDao.findRoleByUserId(id);
            user.setRoles(roles);
        }
        return userList;
    }

    @Override
    public void save(User user, Long[] roleIds) {
        //第一步向sys_user表中存储数据
        Long userId = userDao.save(user);
        //向sys_user_role关系表中存储多条数据
        userDao.saveUserRoleRel(userId, roleIds);
    }

    @Override
    public void del(Long userId) {
        //删除sys_user_role关系表
        userDao.delUserRoleRel(userId);
        //删除sys_user表
        userDao.del(userId);
    }
}
