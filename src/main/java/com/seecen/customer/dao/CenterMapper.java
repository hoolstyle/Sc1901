package com.seecen.customer.dao;

import com.seecen.customer.entity.Center;
import com.seecen.customer.entity.CenterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CenterMapper {
    //各公司下的客户信息
    List<Center> findList(Integer id);
    //判断是否已存在的公司名
    int accountCenter(String centerName);

    int countByExample(CenterExample example);

    int deleteByExample(CenterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Center record);

    int insertSelective(Center record);

    List<Center> selectByExample(CenterExample example);

    Center selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Center record, @Param("example") CenterExample example);

    int updateByExample(@Param("record") Center record, @Param("example") CenterExample example);

    int updateByPrimaryKeySelective(Center record);

    int updateByPrimaryKey(Center record);
}