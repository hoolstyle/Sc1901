package com.seecen.customer.service;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Center;

import java.util.List;

public interface CenterService {
    //遍历
    public List<Center> centerList();

    //分页
    public PageInfo<Center> pageCenter(PageInfo<Center> pageInfo,String centerName);
    //添加
    public Boolean addCenter(Center center);
    //删除
    public Boolean delCenter(Integer id);
    //批量删除
    public boolean delAllCenter(List<Integer> ids);
    //修改回显
    public Center selCenter(Integer id);
    //修改
    public Boolean updateCenter(Center center);
    //修改状态
    public Boolean updateFlag(Integer id);

    public PageInfo<Center> findList(PageInfo<Center> pageInfo,Integer id);

    //判断存在
    public int accountCenter(String centerName);
}
