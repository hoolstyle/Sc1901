package com.seecen.customer.dao;

import com.seecen.customer.entity.Customer;
import com.seecen.customer.entity.CustomerExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {
    /*分页-客户*/
    List<Customer> selectCustomer(@Param("start")Date start,@Param("end")Date end, Customer customer,@Param("channelId")Integer channelId,@Param("centerId")Integer centerId);
    /*分页-学生*/
    List<Customer> selectCustomers(@Param("start")Date start,@Param("end")Date end, Customer customer,@Param("channelId")Integer channelId,@Param("centerId")Integer centerId);
    /*姓名模糊查询*/
    List<Customer> selectCustomerName(String customerName);
    /*修改回显*/
    Customer selectFind(Integer customerId);

    int countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

}