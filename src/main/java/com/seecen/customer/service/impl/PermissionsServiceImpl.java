package com.seecen.customer.service.impl;

import com.seecen.customer.dao.PermissionsDaoMapper;
import com.seecen.customer.entity.Permissions;
import com.seecen.customer.service.PermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @Author 山泊树
 * @create 2019/7/16 19:58
 */
@Service
public class PermissionsServiceImpl implements PermissionsService {

    @Autowired
    private PermissionsDaoMapper permissionsMapper;

    @Override
    public Set<Permissions> findPermissionsById(Integer id) {
        return permissionsMapper.findPermissionById(id);
    }
}
