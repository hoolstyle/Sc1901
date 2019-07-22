package com.seecen.customer.service;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Customer;

import java.util.Date;
import java.util.List;

public interface CustomerService {
    //客户分页列表
    public PageInfo<Customer> pageCustomer(PageInfo<Customer> info, String customerName, Date start,Date end,Integer channelId,Integer centerId);
    //学生分页列表
    public PageInfo<Customer> pageCustomer2(PageInfo<Customer> info, String customerName, Date start,Date end,Integer channelId,Integer centerId);
    //添加
    public boolean addCustomer(Customer customer);
    //修改回显
    public Customer selectCustomer(Integer customerId);
    //修改
    public boolean updateCustomer(Customer customer);
    //删除
    public boolean delCustomer(Integer customerId);
    //批量删除
    public boolean delAll(List<Integer> ids);
    //改变状态
    public boolean updateFlag(Integer customerId);
}
