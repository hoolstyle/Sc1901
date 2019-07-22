package com.seecen.customer.shiro;

import com.seecen.customer.entity.*;
import com.seecen.customer.service.*;
import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @Author 山泊树
 * @create 2019/7/13 11:28
 */
public class UserRealm extends AuthorizingRealm {

/**
     * 执行授权逻辑
     * @param principalCollection
     * @return*/

     @Autowired
     private UserRolesService userRolesService;
     @Autowired
     private RolesPermissionsService rolesPermissionsService;
     @Autowired
     private PermissionsService permissionsService;
     @Autowired
     private RoleService roleService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行授权逻辑");
        //授权时需要把保存在shiro的session里的对象拿出来
        User user = (User) principalCollection.fromRealm(this.getClass().getName()).iterator().next();
        //一层一层的拔权限
        List<String> permissionList = new ArrayList<>();
        List<String> roleNameList = new ArrayList<>();
        Set<UsersRoles> roleSet =userRolesService.findUsersRolesByUserId(user.getUserId());
        if (CollectionUtils.isNotEmpty(roleSet)){
            for(UsersRoles usersRoles : roleSet){
                //根据roleId去查角色名,给用户赋予角色
                Set<Role> userRole = roleService.findRolesById(usersRoles.getRoleId());
                if (CollectionUtils.isNotEmpty(userRole)){
                    for (Role role : userRole){
                        roleNameList.add(role.getRoleName());
                    }
                }
                //给用户赋予权限
                Set<RolesPermissions> permissionIdSet = rolesPermissionsService.findRolesPermissionById(usersRoles.getRoleId());
                if (CollectionUtils.isNotEmpty(permissionIdSet)){
                    for (RolesPermissions rolesPermissions : permissionIdSet){
                        Set<Permissions> permissionSet = permissionsService.findPermissionsById(rolesPermissions.getPermissionId());
                        if (CollectionUtils.isNotEmpty(permissionSet)){
                            for (Permissions permissions : permissionSet){
                                permissionList.add(permissions.getPerDescription());
                            }
                        }
                    }
                }
            }
        }
        //给资源进行授权
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //添加资源的授权字符串
        info.addRoles(roleNameList);
        info.addStringPermissions(permissionList);
        return info;
    }

    @Autowired
    private UserService userService;

/**
     * 认证流程中的自定义认证逻辑方法
     * @param authenticationToken
     * @return
     * @throws AuthenticationException*/


    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行认证逻辑");

        //编写shiro判断逻辑，判断用户名和密码
        //1、判断用户名
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        User user = userService.findByName(token.getUsername());
        if (user==null){
            //用户名不存在
            return null;//shiro底层会抛出UnknownAccountException
        }
        //2、判断密码
        return new SimpleAuthenticationInfo(user,
                user.getUserPsw(),
                this.getClass().getName());
    }
}
