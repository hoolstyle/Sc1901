package com.seecen.customer.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seecen.customer.dao.InterviewMapper;
import com.seecen.customer.entity.Interview;
import com.seecen.customer.entity.InterviewExample;
import com.seecen.customer.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

@Service
public class ViewServiceImpl implements ViewService {
    @Autowired
    private InterviewMapper interviewMapper;

    @Override
    public PageInfo<Interview> findViewByPage(Integer viewStatus,String name, Date start, Date end, Integer pageNum, PageInfo<Interview> info) {
        InterviewExample interviewExample=new InterviewExample();
        InterviewExample.Criteria criteria=interviewExample.createCriteria();
        if (viewStatus!=null){
            criteria.andConStatusEqualTo(viewStatus);
        }
        if (!StringUtils.isEmpty(name)){
            criteria.andUserNameLike("%"+name+"%");
        }
        if (start!=null){
            criteria.andViewTimeGreaterThanOrEqualTo(start);
        }
        if (end!=null){
            criteria.andViewTimeLessThanOrEqualTo(end);
        }
        PageHelper.startPage(info.getPageNum(),info.getPageSize());
        List<Interview> list=interviewMapper.selectByExample(interviewExample);
        return PageInfo.of(list);
    }

    @Override
    public Boolean addView(Interview interview) {
        interview.setConStatus(0);
        return interviewMapper.insert(interview)>0;
    }

    @Override
    public Interview findViewById(Integer id) {
        return interviewMapper.selectByPrimaryKey(id);
    }

    @Override
    public Boolean updateView(Interview interview) {
        return interviewMapper.updateByPrimaryKey(interview)>0;
    }

    @Override
    public Boolean delView(Integer id){
        return interviewMapper.deleteByPrimaryKey(id)>0;
    }
}
