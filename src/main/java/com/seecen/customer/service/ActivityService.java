package com.seecen.customer.service;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Activity;

public interface ActivityService {
        public PageInfo<Activity> findActivityByTeam(PageInfo<Activity> info, String teamName);

        public PageInfo<Activity> findActivityByPage(PageInfo<Activity> info);

        public Activity findActivityById(Integer id);

        public boolean addAct(Activity activity);

        public boolean updateAct(Activity activity);

        public boolean delAct(Integer id);

}
