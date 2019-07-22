package com.seecen.customer.dao;

import com.seecen.customer.entity.Activity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ActivityDao {
  List<Activity> findActivityByTeam(@Param("teamName") String teamName);
}
