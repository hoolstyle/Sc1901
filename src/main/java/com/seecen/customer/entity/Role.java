package com.seecen.customer.entity;

public class Role {
    private Integer roleId;

    private String roleName;

    private String roleDescription;

    private Integer rolePid;

    private Integer roleAvailable;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription == null ? null : roleDescription.trim();
    }

    public Integer getRolePid() {
        return rolePid;
    }

    public void setRolePid(Integer rolePid) {
        this.rolePid = rolePid;
    }

    public Integer getRoleAvailable() {
        return roleAvailable;
    }

    public void setRoleAvailable(Integer roleAvailable) {
        this.roleAvailable = roleAvailable;
    }
}