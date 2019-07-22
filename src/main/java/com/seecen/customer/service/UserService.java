package com.seecen.customer.service;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.User;

import java.util.Date;
import java.util.Set;

/**
 * @Author 山泊树
 * @create 2019/7/12 19:50
 */
public interface UserService {


    //加密之前的查询
    public User md5ByUserId(Integer id);

    //认证查询
    public User findByName(String userName);

    public User findUserByName(String userName);

    //根据用户名获取角色字符串
    public Set<String> findRoleByName(String userName);
    //根据用户名获取权限字符串
    public Set<String> findPermsByName(String userName);

    //用户表分页查询
    public PageInfo<User> findUserByPage(PageInfo<User> info
            , String userName, Date start, Date end);

    //用户增加
    public boolean insertUser(User user);

    //用户删除
    public boolean delUser(Integer id);

    //根据用户ID修改
    public User updateById(Integer id);
    //修改后保存
    public boolean saveUser(User user);

}
