package com.seecen.customer.dao;

import com.seecen.customer.entity.Attendance;
import com.seecen.customer.entity.AttendanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendanceMapper {
    int countByExample(AttendanceExample example);

    int deleteByExample(AttendanceExample example);

    int insert(Attendance record);

    Attendance selectById(Integer id);

    int updateByExampleByPrimarySelective(Attendance attendance);

    int insertSelective(Attendance record);

    List<Attendance> selectByExample(AttendanceExample example);

    int updateByExampleSelective(@Param("record") Attendance record, @Param("example") AttendanceExample example);

    int updateByExample(@Param("record") Attendance record, @Param("example") AttendanceExample example);
}