package com.seecen.customer.service;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Interview;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Date;

public interface ViewService {
    PageInfo<Interview> findViewByPage(Integer viewStatus,String name, Date start,Date end,Integer pageNum,PageInfo<Interview> info);
    Boolean addView(Interview interview);
    Interview findViewById(Integer id);
    Boolean updateView(Interview interview);
    Boolean delView(Integer id);
}
