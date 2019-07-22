package com.seecen.customer.dao;

import com.seecen.customer.entity.Customer;
import com.seecen.customer.entity.Team;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CustomerDao extends CustomerMapper{
    List<Customer> selectCustomerAndTeamByExample(Integer id);
    Customer findById(Integer id);
    List<Team> findTeam();
}
