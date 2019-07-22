package com.seecen.customer.service.impl;

import com.seecen.customer.dao.UsersRolesDaoMapper;
import com.seecen.customer.entity.UsersRoles;
import com.seecen.customer.service.UserRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @Author 山泊树
 * @create 2019/7/16 18:58
 */
@Service
public class UserRolesServiceImpl implements UserRolesService {

    @Autowired
    private UsersRolesDaoMapper usersRolesDaoMapper;

    @Override
    public Set<UsersRoles> findUsersRolesByUserId(Integer id) {
        return usersRolesDaoMapper.findUsersRoles(id);
    }
}
