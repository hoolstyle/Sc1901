package com.seecen.customer.service;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Attendance;
import com.seecen.customer.entity.Customer;
import com.seecen.customer.entity.Team;

import java.util.List;


public interface AttendService {
    public PageInfo<Attendance> list(PageInfo<Attendance> info,Integer classId,String customerName);

    public List<Attendance> findClass();
    public List<Team> findTeam();
    public List<Customer> findCustomerById(Integer id);
    public List<Customer> findCustomer(Integer id);
    public boolean insert(Attendance attendance);
    public Attendance findAttendanceById(Integer id);
    public boolean update(Attendance attendance);
}
