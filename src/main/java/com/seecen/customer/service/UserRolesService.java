package com.seecen.customer.service;

import com.seecen.customer.entity.UsersRoles;

import java.util.Set;

/**
 * @Author 山泊树
 * @create 2019/7/16 18:55
 */
public interface UserRolesService {

    public Set<UsersRoles> findUsersRolesByUserId(Integer id);
}
