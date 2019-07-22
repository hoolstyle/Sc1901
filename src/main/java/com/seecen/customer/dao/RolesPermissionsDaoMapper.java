package com.seecen.customer.dao;

import com.seecen.customer.entity.RolesPermissions;
import com.seecen.customer.entity.RolesPermissionsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface RolesPermissionsDaoMapper {

    Set<RolesPermissions> findRolePermissionsById(Integer id);

}