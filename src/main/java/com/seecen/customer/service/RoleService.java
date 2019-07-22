package com.seecen.customer.service;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;


/**
 * @Author 山泊树
 * @create 2019/7/13 20:40
 */
@Repository
public interface RoleService {
    public PageInfo<Role> findRoleByPage(PageInfo<Role> info
            , String roleName, String roleDescription);

    //用户添加时角色动态匹配用户
    public List<Role> findRoles();

    //查看这个用户的所有角色
    public Set<Role> findRolesById(Integer id);
}
