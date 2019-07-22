package com.seecen.customer.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seecen.customer.dao.AttendDao;
import com.seecen.customer.dao.CustomerMapper;
import com.seecen.customer.dao.TeamMapper;
import com.seecen.customer.entity.*;
import com.seecen.customer.service.AttendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.List;
@Service
public class AttendServiceImpl implements AttendService {

    @Autowired
    private AttendDao attendDao;

    @Autowired
    private TeamMapper teamMapper;

    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public PageInfo<Attendance> list(PageInfo<Attendance> info,Integer classId,String customerName) {
        Team team = new Team();
        if (classId != null){
            TeamExample teamExample = new TeamExample();
            TeamExample.Criteria cri=teamExample.createCriteria();
            cri.andTeamIdEqualTo(classId);
            if(teamMapper.selectByExample(teamExample).size()<1){
                return null;
            }
            team = teamMapper.selectByExample(teamExample).get(0);
        }
        Customer customer = new Customer();
        if (!StringUtils.isEmpty(customerName)){
            CustomerExample customerExample = new CustomerExample();
            CustomerExample.Criteria cri=customerExample.createCriteria();
            cri.andCustomerNameEqualTo(customerName);
            if(customerMapper.selectByExample(customerExample).size()<1){
                return null;
            }
            customer = customerMapper.selectByExample(customerExample).get(0);
        }
        PageHelper.startPage(info.getPageNum(),info.getPageSize());
        List<Attendance> list =
        attendDao.findAttendanceAndCustomer(team.getTeamId(),customer.getCustomerId());
        if (list.size()>0){
            return PageInfo.of(list);
        }
        return null;
    }

    @Override
    public List<Attendance> findClass() {
        List<Attendance> list =
                attendDao.findClass();
        return list;
    }

    @Override
    public List<Team> findTeam() {
        return teamMapper.selectByExample(null);
    }

    @Override
    public List<Customer> findCustomerById(Integer id) {
        return attendDao.findCustomer(id);
    }

    @Override
    public List<Customer> findCustomer(Integer id) {
        List<Customer> list = attendDao.findCustomerName(id);
        return list;
    }

    @Override
    public boolean insert(Attendance attendance) {
        if (attendDao.insert(attendance)>0){
            return true;
        }
        return false;
    }

    @Override
    public Attendance findAttendanceById(Integer id) {
        Attendance attendance = attendDao.selectById(id);
            return attendance;
    }

    @Override
    public boolean update(Attendance attendance) {
       if (attendDao.updateByExampleByPrimarySelective(attendance)>0){
           return true;
       }
        return false;
    }
}
