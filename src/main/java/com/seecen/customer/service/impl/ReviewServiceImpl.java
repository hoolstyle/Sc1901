package com.seecen.customer.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seecen.customer.dao.CustomerMapper;
import com.seecen.customer.dao.ReviewDao;
import com.seecen.customer.dao.ReviewMapper;
import com.seecen.customer.entity.Customer;
import com.seecen.customer.entity.CustomerExample;
import com.seecen.customer.entity.Review;
import com.seecen.customer.entity.ReviewExample;
import com.seecen.customer.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewDao reviewDao;

    @Autowired
    private ReviewMapper reviewMapper;


    @Override
    public PageInfo<Review> findReviewByPage(PageInfo<Review> info, String userName) {
        PageHelper.startPage(info.getPageNum(),info.getPageSize(),"review_id");
        List<Review> list=reviewDao.findReviewByTeacher(userName);
        return PageInfo.of(list);
    }

    @Override
    public boolean addReview(Review review) {
        return reviewMapper.insertSelective(review)>0;
    }


    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public List<Customer> findStudent() {
        CustomerExample example=new CustomerExample();
        CustomerExample.Criteria cri=example.createCriteria();
        cri.andCustomerFlagEqualTo(1);
        return customerMapper.selectByExample(example);
    }

    @Override
    public Customer findStudentById(Integer id) {
        return customerMapper.selectByPrimaryKey(id);
    }

    @Override
    public Review findReviewById(Integer id) {
        return reviewMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateReview(Review review) {
        ReviewExample example=new ReviewExample();
        ReviewExample.Criteria cri=example.createCriteria();
        cri.andReviewIdEqualTo(review.getReviewId());
        return reviewMapper.updateByExampleSelective(review,example)>0;
    }
}
