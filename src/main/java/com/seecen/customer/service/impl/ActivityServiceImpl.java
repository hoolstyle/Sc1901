package com.seecen.customer.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seecen.customer.dao.ActivityDao;
import com.seecen.customer.dao.ActivityMapper;
import com.seecen.customer.entity.Activity;
import com.seecen.customer.entity.ActivityExample;
import com.seecen.customer.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityDao activityDao;

    @Autowired
    private ActivityMapper activityMapper;

    @Override
    public PageInfo<Activity> findActivityByTeam(PageInfo<Activity> info, String teamName) {
        PageHelper.startPage(info.getPageNum(),info.getPageSize(),"act_date desc");
        List<Activity> list=activityDao.findActivityByTeam(teamName);
        return  PageInfo.of(list);
    }

    @Override
    public PageInfo<Activity> findActivityByPage(PageInfo<Activity> info) {
        PageHelper.startPage(info.getPageNum(),info.getPageSize(),"act_id");
        List<Activity> list=activityMapper.selectByExample(null);
        return PageInfo.of(list);
    }

    @Override
    public Activity findActivityById(Integer id) {
        return activityMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean addAct(Activity activity) {
        return activityMapper.insertSelective(activity)>0;
    }

    @Override
    public boolean updateAct(Activity activity) {
        ActivityExample example=new ActivityExample();
        ActivityExample.Criteria cri=example.createCriteria();
        cri.andActIdEqualTo(activity.getActId());
        return activityMapper.updateByExampleSelective(activity,example)>0;
    }

    @Override
    public boolean delAct(Integer id) {
        return activityMapper.deleteByPrimaryKey(id)>0;
    }
}
