package com.seecen.customer.dao;

import com.seecen.customer.entity.Talk;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TalkDao extends TalkMapper{
    List<Talk> findTalkAndCustomer(@Param("cId") Integer cId);
}
