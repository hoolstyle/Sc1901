package com.seecen.customer.dao;

import com.seecen.customer.entity.Permissions;
import com.seecen.customer.entity.PermissionsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface PermissionsDaoMapper {

    Set<Permissions> findPermissionById(Integer id);

}