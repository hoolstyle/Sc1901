package com.seecen.customer.service;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Customer;
import com.seecen.customer.entity.Team;

import java.util.Date;
import java.util.List;


public interface TeamService {
    public PageInfo<Team> findTeamByPage(String teamName, PageInfo<Team> info, Date start, Date end);

    public Team findTeamById(Integer id);

    public boolean addTeam(Team team);

    public boolean delTeam(Integer id);

    public boolean updateTeam(Team team);

    public PageInfo<Customer> findStudentByPage(String customerName,PageInfo<Customer>info);

    public Customer findStudentById(Integer id);

    public List<Team> findTeam();

    public boolean addStudent(Customer customer);
}
