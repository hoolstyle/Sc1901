package com.seecen.customer.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.seecen.customer.dao.CustomerDao;
import com.seecen.customer.dao.TeamMapper;
import com.seecen.customer.entity.Customer;
import com.seecen.customer.entity.Team;
import com.seecen.customer.entity.TeamExample;
import com.seecen.customer.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    public CustomerDao customerDao;

    @Autowired
    private TeamMapper teamMapper;

    @Override
    public PageInfo<Customer> findCustomerAndTeamByPage(PageInfo<Customer> info, String name) {
        Team team = new Team();
        if (!StringUtil.isEmpty(name)){
            TeamExample teamExample = new TeamExample();
            TeamExample.Criteria cri=teamExample.createCriteria();
            cri.andTeamNameEqualTo(name);
            if(teamMapper.selectByExample(teamExample).size()<1){
                return null;
            }
            team = teamMapper.selectByExample(teamExample).get(0);
        }
        PageHelper.startPage(info.getPageNum(),info.getPageSize());
        List<Customer> list = customerDao.selectCustomerAndTeamByExample(team.getTeamId());
        return PageInfo.of(list);
    }

    @Override
    public Customer findCustomer(Integer id) {
        Customer customer =  customerDao.findById(id);
        if (customer!=null){
            return customer;
        }
        return null;
    }

    @Override
    public List<Team> findTeam() {
        List<Team> list = customerDao.findTeam();
        return list;
    }

    @Override
    public boolean update(Customer customer) {
        if (customerDao.updateByPrimaryKeySelective(customer)>0){
            return true;
        }
        return false;
    }
}
