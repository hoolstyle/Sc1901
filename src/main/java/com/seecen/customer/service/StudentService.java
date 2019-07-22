package com.seecen.customer.service;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Customer;
import com.seecen.customer.entity.Team;

import java.util.Date;
import java.util.List;

public interface StudentService {
    public PageInfo<Customer> findCustomerAndTeamByPage(PageInfo<Customer> info, String name);
    public Customer findCustomer(Integer id);
    public List<Team> findTeam();
    public boolean update(Customer customer);

}
