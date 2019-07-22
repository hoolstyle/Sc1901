package com.seecen.customer.dao;

import com.seecen.customer.entity.Entry;
import com.seecen.customer.entity.EntryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntryMapper {
    int countByExample(EntryExample example);

    int deleteByExample(EntryExample example);

    int deleteByPrimaryKey(Integer entryId);

    int insert(Entry record);

    int insertSelective(Entry record);

    List<Entry> selectByExample(EntryExample example);

    Entry selectByPrimaryKey(Integer entryId);

    int updateByExampleSelective(@Param("record") Entry record, @Param("example") EntryExample example);

    int updateByExample(@Param("record") Entry record, @Param("example") EntryExample example);

    int updateByPrimaryKeySelective(Entry record);

    int updateByPrimaryKey(Entry record);
}