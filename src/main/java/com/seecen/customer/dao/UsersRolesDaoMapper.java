package com.seecen.customer.dao;

import com.seecen.customer.entity.UsersRoles;
import com.seecen.customer.entity.UsersRolesExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface UsersRolesDaoMapper {

    Set<UsersRoles> findUsersRoles(Integer id);



}