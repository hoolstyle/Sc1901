package com.seecen.customer.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seecen.customer.dao.NoticeMapper;
import com.seecen.customer.entity.Notice;
import com.seecen.customer.entity.NoticeExample;
import com.seecen.customer.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * @Author 山泊树
 * @create 2019/7/15 9:11
 */
@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public PageInfo<Notice> findNoticeByPage(PageInfo<Notice> info, String nTitle, Date start, Date end) {
        NoticeExample example = new NoticeExample();
        NoticeExample.Criteria cri = example.createCriteria();
        if (!StringUtils.isEmpty(nTitle)) {
            cri.andNTitleLike("%" + nTitle + "%");
        }
        if (start != null) {
            cri.andNCreatetimeGreaterThanOrEqualTo(start);
        }
        if (end != null) {
            cri.andNCreatetimeLessThan(end);
        }
        PageHelper.startPage(info.getPageNum(), info.getPageSize());
        List<Notice> list = noticeMapper.selectByExample(example);
        return PageInfo.of(list);
    }

    @Override
    public boolean addNotice(Notice notice) {
        if (noticeMapper.insertSelective(notice)>0){
            return true;
        }
        return false;
    }

    @Override
    public List<Notice> showNotice() {
        NoticeExample example = new NoticeExample();
        NoticeExample.Criteria cri = example.createCriteria();
        cri.andNIdIsNotNull();
        List<Notice> list = noticeMapper.selectByExample(example);
        return list;
    }
}
