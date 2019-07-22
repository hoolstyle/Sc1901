package com.seecen.customer.dao;

import com.seecen.customer.entity.Attendance;
import com.seecen.customer.entity.Customer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface AttendDao extends AttendanceMapper{
    public List<Attendance> findAttendanceAndCustomer(@Param("id") Integer id, @Param("cId") Integer cId);
    public List<Attendance> findClass();
    public List<Customer> findCustomer(Integer tId);
    public List<Customer> findCustomerName(Integer id);
}
