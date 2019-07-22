package com.seecen.customer.service;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Notice;

import java.util.Date;
import java.util.List;

/**
 * @Author 山泊树
 * @create 2019/7/15 9:09
 */
public interface NoticeService {
    //公告表分页查询
    public PageInfo<Notice> findNoticeByPage(PageInfo<Notice> info
            , String userName, Date start, Date end);

    //添加公告
    public boolean addNotice(Notice notice);

    //让公告显示在首页上
    public List<Notice> showNotice();
}
