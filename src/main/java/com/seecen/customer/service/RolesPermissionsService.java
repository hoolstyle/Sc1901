package com.seecen.customer.service;

import com.seecen.customer.entity.RolesPermissions;

import java.util.Set;

/**
 * @Author 山泊树
 * @create 2019/7/16 19:39
 */
public interface RolesPermissionsService {

    public Set<RolesPermissions> findRolesPermissionById(Integer id);

}
