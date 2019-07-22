package com.seecen.customer.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.seecen.customer.dao.CustomerMapper;
import com.seecen.customer.dao.TeamDao;
import com.seecen.customer.dao.TeamMapper;
import com.seecen.customer.entity.Customer;
import com.seecen.customer.entity.CustomerExample;
import com.seecen.customer.entity.Team;
import com.seecen.customer.entity.TeamExample;
import com.seecen.customer.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamMapper teamMapper;


    @Override
    public PageInfo<Team> findTeamByPage(String teamName, PageInfo<Team> info, Date start, Date end) {
        TeamExample example=new TeamExample();
        TeamExample.Criteria cri=example.createCriteria();
        if(!StringUtil.isEmpty(teamName)){
            cri.andTeamNameLike("%"+teamName+"%");
        }
        if(start!=null){
            cri.andTeamDateGreaterThanOrEqualTo(start);
        }
        if(end!=null){
            cri.andTeamDateLessThan(end);
        }
        PageHelper.startPage(info.getPageNum(),info.getPageSize(),"team_id");
        List<Team> list=teamMapper.selectByExample(example);
        return PageInfo.of(list);
    }

    @Override
    public Team findTeamById(Integer id) {
      return teamMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean addTeam(Team team) {
        return teamMapper.insertSelective(team)>0;
    }

    @Override
    public boolean delTeam(Integer id) {
      return   teamMapper.deleteByPrimaryKey(id)>0;
    }

    @Override
    public boolean updateTeam(Team team) {
        TeamExample example=new TeamExample();
        TeamExample.Criteria cri=example.createCriteria();
        cri.andTeamIdEqualTo(team.getTeamId());
        return teamMapper.updateByExampleSelective(team,example)>0;
    }


    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public PageInfo<Customer> findStudentByPage(String customerName, PageInfo<Customer> info) {
        CustomerExample example=new CustomerExample();
        CustomerExample.Criteria cri=example.createCriteria();
        cri.andCustomerFlagEqualTo(1);
        if(!StringUtil.isEmpty(customerName)){
            cri.andCustomerNameLike("%"+customerName+"%");
        }
        PageHelper.startPage(info.getPageNum(),info.getPageSize(),"customer_date");
        List<Customer> list=customerMapper.selectByExample(example);
        return PageInfo.of(list);
    }

    @Override
    public Customer findStudentById(Integer id) {
        return customerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Team> findTeam() {
        return teamMapper.selectByExample(null);
    }

    @Override
    public boolean addStudent(Customer customer) {
        CustomerExample example=new CustomerExample();
        CustomerExample.Criteria cri=example.createCriteria();
        cri.andCustomerIdEqualTo(customer.getCustomerId());
        return customerMapper.updateByExampleSelective(customer,example)>0;
    }


}
