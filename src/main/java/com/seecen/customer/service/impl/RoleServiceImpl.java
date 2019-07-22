package com.seecen.customer.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seecen.customer.dao.RoleDaoMapper;
import com.seecen.customer.dao.RoleMapper;
import com.seecen.customer.entity.Role;
import com.seecen.customer.entity.RoleExample;
import com.seecen.customer.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.List;
import java.util.Set;


/**
 * @Author 山泊树
 * @create 2019/7/13 20:41
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private RoleDaoMapper roleDaoMapper;

    @Override
    public PageInfo<Role> findRoleByPage(PageInfo<Role> info, String roleName,String roleDescription) {

        RoleExample example = new RoleExample();
        RoleExample.Criteria cri = example.createCriteria();
        if (!StringUtils.isEmpty(roleName)) {
            cri.andRoleNameLike("%" + roleName + "%");
        }
        if (roleDescription != null) {
            cri.andRoleDescriptionLike("%" + roleDescription + "%");
        }
        PageHelper.startPage(info.getPageNum(), info.getPageSize());
        List<Role> list = roleMapper.selectByExample(example);
        return PageInfo.of(list);
    }

    @Override
    public List<Role> findRoles() {
        RoleExample example = new RoleExample();
        RoleExample.Criteria cri = example.createCriteria();
        cri.andRoleIdIsNotNull();
        List<Role> list = roleMapper.selectByExample(example);
        return list;
    }

    @Override
    public Set<Role> findRolesById(Integer id) {
        return roleDaoMapper.findRolesById(id);
    }
}
