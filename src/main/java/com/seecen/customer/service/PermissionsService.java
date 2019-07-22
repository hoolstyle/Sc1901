package com.seecen.customer.service;

import com.seecen.customer.entity.Permissions;

import java.util.Set;

/**
 * @Author 山泊树
 * @create 2019/7/16 19:56
 */
public interface PermissionsService {

    public Set<Permissions> findPermissionsById(Integer id);

}
