package com.seecen.customer.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seecen.customer.dao.CustomerMapper;
import com.seecen.customer.dao.TalkDao;
import com.seecen.customer.entity.Customer;
import com.seecen.customer.entity.CustomerExample;
import com.seecen.customer.entity.Talk;
import com.seecen.customer.service.TalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.List;
@Service
public class TalkServiceImpl implements TalkService {

    @Autowired
    private TalkDao talkDao;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public PageInfo<Talk> findCustomerAndTeamByPage(PageInfo<Talk> info, String name) {
        Customer customer = new Customer();
        if (!StringUtils.isEmpty(name)){
            CustomerExample customerExample = new CustomerExample();
            CustomerExample.Criteria criteria = customerExample.createCriteria();
            criteria.andCustomerNameLike("%"+name+"%");
            if(customerMapper.selectByExample(customerExample).size()==0){
                PageHelper.startPage(info.getPageNum(),info.getPageSize());
                List<Talk> list = talkDao.findTalkAndCustomer(null);
                return PageInfo.of(list);
            }
            List<Customer> customers = customerMapper.selectByExample(customerExample);
            customer = customers.get(0);
        }
        PageHelper.startPage(info.getPageNum(),info.getPageSize());
        List<Talk> list = talkDao.findTalkAndCustomer(customer.getCustomerId());
        return PageInfo.of(list);
    }
}
