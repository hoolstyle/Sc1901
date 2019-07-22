package com.seecen.customer.dao;

import com.seecen.customer.entity.RolesPermissions;
import com.seecen.customer.entity.RolesPermissionsExample;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesPermissionsMapper {

    int countByExample(RolesPermissionsExample example);

    int deleteByExample(RolesPermissionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RolesPermissions record);

    int insertSelective(RolesPermissions record);

    List<RolesPermissions> selectByExample(RolesPermissionsExample example);

    RolesPermissions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RolesPermissions record, @Param("example") RolesPermissionsExample example);

    int updateByExample(@Param("record") RolesPermissions record, @Param("example") RolesPermissionsExample example);

    int updateByPrimaryKeySelective(RolesPermissions record);

    int updateByPrimaryKey(RolesPermissions record);
}