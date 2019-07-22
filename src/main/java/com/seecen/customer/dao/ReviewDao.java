package com.seecen.customer.dao;

import com.seecen.customer.entity.Review;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewDao {
    List<Review> findReviewByTeacher(@Param("userName") String userName);
}
