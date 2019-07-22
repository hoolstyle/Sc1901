package com.seecen.customer.dao;

import com.seecen.customer.entity.UsersRoles;
import com.seecen.customer.entity.UsersRolesExample;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRolesMapper {

    int countByExample(UsersRolesExample example);

    int deleteByExample(UsersRolesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UsersRoles record);

    int insertSelective(UsersRoles record);

    List<UsersRoles> selectByExample(UsersRolesExample example);

    UsersRoles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UsersRoles record, @Param("example") UsersRolesExample example);

    int updateByExample(@Param("record") UsersRoles record, @Param("example") UsersRolesExample example);

    int updateByPrimaryKeySelective(UsersRoles record);

    int updateByPrimaryKey(UsersRoles record);
}