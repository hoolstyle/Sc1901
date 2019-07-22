package com.seecen.customer.service;


import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Customer;
import com.seecen.customer.entity.Review;

import java.util.List;

public interface ReviewService {
    public PageInfo<Review> findReviewByPage(PageInfo<Review> info,String userName);

    public boolean addReview(Review review);

    public List<Customer> findStudent();

    public Customer findStudentById(Integer id);

    public Review findReviewById(Integer id);

    public boolean updateReview(Review review);

}
