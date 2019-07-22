package com.seecen.customer.service.impl;

import com.seecen.customer.dao.RolesPermissionsDaoMapper;
import com.seecen.customer.entity.RolesPermissions;
import com.seecen.customer.service.RolesPermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @Author 山泊树
 * @create 2019/7/16 19:40
 */
@Service
public class RolesPermissionsServiceImpl implements RolesPermissionsService {

    @Autowired
    private RolesPermissionsDaoMapper rolesPermissionsMapper;

    @Override
    public Set<RolesPermissions> findRolesPermissionById(Integer id) {
        return rolesPermissionsMapper.findRolePermissionsById(id) ;
    }
}
