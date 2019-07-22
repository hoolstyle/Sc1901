package com.seecen.customer.dao;

import com.seecen.customer.entity.Role;
import com.seecen.customer.entity.RoleExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface RoleDaoMapper {

    //关联表查角色，给用户授权
    Set<Role> findRolesById(Integer id);

}