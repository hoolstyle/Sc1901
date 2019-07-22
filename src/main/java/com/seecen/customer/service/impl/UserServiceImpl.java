package com.seecen.customer.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seecen.customer.dao.UserDaoMapper;
import com.seecen.customer.dao.UserMapper;
import com.seecen.customer.entity.Permissions;
import com.seecen.customer.entity.User;
import com.seecen.customer.entity.UserExample;
import com.seecen.customer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author 山泊树
 * @create 2019/7/12 19:52
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserDaoMapper userDaoMapper;

    @Override
    public User md5ByUserId(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    //认证查询
    @Override
    public User findByName(String userName) {
        return userDaoMapper.findByName(userName);
    }

    @Override
    public User findUserByName(String userName) {
        UserExample example = new UserExample();
        UserExample.Criteria cri = example.createCriteria();
        cri.andUserNameEqualTo(userName);
        List<User> list = userMapper.selectByExample(example);
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public Set<String> findRoleByName(String userName) {
        List<User> list = userDaoMapper.findUserRoleByName(userName);
        Set<String> set = new HashSet<>();
        for (User u : list) {
            set.add(u.getUserRemark());
        }
        return set;
    }

    @Override
    public Set<String> findPermsByName(String userName) {
        List<Permissions> list = userDaoMapper.findUserPermsByName(userName);
        Set<String> perms = new HashSet<>();
        for (Permissions p : list
                ) {
            perms.add(p.getPerDescription());
        }
        return perms;
    }

    //用户分页查询
    @Override
    public PageInfo<User> findUserByPage(PageInfo<User> info, String userName, Date start, Date end) {
        UserExample example = new UserExample();
        UserExample.Criteria cri = example.createCriteria();
        if (!StringUtils.isEmpty(userName)) {
            cri.andUserNameLike("%" + userName + "%");
        }
        if (start != null) {
            cri.andUserCreatetimeGreaterThanOrEqualTo(start);
        }
        if (end != null) {
            cri.andUserCreatetimeLessThan(end);
        }
        PageHelper.startPage(info.getPageNum(), info.getPageSize());
        List<User> list = userMapper.selectByExample(example);
        return PageInfo.of(list);
    }

    @Override
    public boolean insertUser(User user) {
        if (userMapper.insertSelective(user) > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean delUser(Integer id) {
        if (userMapper.deleteByPrimaryKey(id)>0){
            return true;
        }
        return false;
    }

    @Override
    public User updateById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean saveUser(User user) {
        if (userMapper.updateByPrimaryKeySelective(user) > 0){
            return true;
        }
        return false;
    }
}
