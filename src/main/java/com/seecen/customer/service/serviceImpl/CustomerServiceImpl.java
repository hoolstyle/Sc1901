package com.seecen.customer.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seecen.customer.dao.CustomerMapper;
import com.seecen.customer.entity.Customer;
import com.seecen.customer.entity.CustomerExample;
import com.seecen.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public PageInfo<Customer> pageCustomer(PageInfo<Customer> info, String customerName, Date start, Date end,Integer channelId,Integer centerId) {
        Customer customer = new Customer();
        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        if (customerName!=null && customerName!=""){
            PageHelper.startPage(info.getPageNum(),info.getPageSize());
            List<Customer> customerList = customerMapper.selectCustomerName(customerName);
      //      criteria.andCustomerNameEqualTo("%"+customerName+"%");
            return PageInfo.of(customerList);
        }else {
            PageHelper.startPage(info.getPageNum(),info.getPageSize());
            List<Customer> customerList = customerMapper.selectCustomer(start,end,customer,channelId,centerId);
            return PageInfo.of(customerList);
        }
//        if (start!=null){
//            criteria.andCustomerDateGreaterThanOrEqualTo(start);
//        }
//        if (end!=null){
//            criteria.andCustomerDateLessThan(end);
//        }

    }

    @Override
    public PageInfo<Customer> pageCustomer2(PageInfo<Customer> info, String customerName, Date start, Date end,Integer channelId,Integer centerId) {
        Customer customer = new Customer();
        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        if (customerName!=null && customerName!=""){
            PageHelper.startPage(info.getPageNum(),info.getPageSize());
            List<Customer> customerList = customerMapper.selectCustomerName(customerName);
            //      criteria.andCustomerNameEqualTo("%"+customerName+"%");
            return PageInfo.of(customerList);
        }else {
            PageHelper.startPage(info.getPageNum(),info.getPageSize());
            List<Customer> customerList = customerMapper.selectCustomers(start,end,customer,channelId,centerId);
            return PageInfo.of(customerList);
        }
    }

    @Override
    public boolean addCustomer(Customer customer) {
        if(customer.getCustomerFlag()==null){
            customer.setCustomerFlag(0);
            if (customerMapper.insert(customer)>0){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

    @Override
    public Customer selectCustomer(Integer customerId) {
        return customerMapper.selectByPrimaryKey(customerId);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        if (customerMapper.updateByPrimaryKey(customer)>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delCustomer(Integer customerId) {
        if (customerMapper.deleteByPrimaryKey(customerId)>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delAll(List<Integer> ids) {
        if (ids.size()>0){
            CustomerExample customerExample = new CustomerExample();
            CustomerExample.Criteria criteria = customerExample.createCriteria();
            criteria.andCustomerIdIn(ids);
            customerMapper.deleteByExample(customerExample);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateFlag(Integer customerId) {
       Customer customer= customerMapper.selectByPrimaryKey(customerId);
       if (customer.getCustomerFlag()==1){
           customer.setCustomerFlag(0);
           customerMapper.updateByPrimaryKey(customer);
           return true;
       }else {
           customer.setCustomerFlag(1);
           customerMapper.updateByPrimaryKey(customer);
           return true;
       }
    }
}
