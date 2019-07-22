package com.seecen.customer.dao;

import com.seecen.customer.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamDao {
    List<Customer> findStudentByFlag();
}
