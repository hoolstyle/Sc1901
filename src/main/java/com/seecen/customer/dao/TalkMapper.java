package com.seecen.customer.dao;

import com.seecen.customer.entity.Talk;
import com.seecen.customer.entity.TalkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface TalkMapper {
    int countByExample(TalkExample example);

    int deleteByExample(TalkExample example);

    int deleteByPrimaryKey(Integer talkId);

    int insert(Talk record);

    int insertSelective(Talk record);

    List<Talk> selectByExample(TalkExample example);

    Talk selectByPrimaryKey(Integer talkId);

    int updateByExampleSelective(@Param("record") Talk record, @Param("example") TalkExample example);

    int updateByExample(@Param("record") Talk record, @Param("example") TalkExample example);

    int updateByPrimaryKeySelective(Talk record);

    int updateByPrimaryKey(Talk record);
}