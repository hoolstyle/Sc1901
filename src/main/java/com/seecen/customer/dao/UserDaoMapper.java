package com.seecen.customer.dao;

import com.seecen.customer.entity.Permissions;
import com.seecen.customer.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 山泊树
 * @create 2019/7/12 20:06
 */
@Repository
public interface UserDaoMapper {

    //验证用户名和密码的查询
    public User findByName(String userName);

    public List<User> findUserRoleByName(String userName);

    public List<Permissions> findUserPermsByName(String userName);
}
