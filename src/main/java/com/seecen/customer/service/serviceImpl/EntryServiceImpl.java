package com.seecen.customer.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seecen.customer.dao.EntryMapper;
import com.seecen.customer.entity.Entry;
import com.seecen.customer.entity.EntryExample;
import com.seecen.customer.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class EntryServiceImpl implements EntryService {
    @Autowired
    private EntryMapper entryMapper;
    @Override
    public PageInfo<Entry> findEntryByPage(PageInfo<Entry> info, String name,Integer classId) {
        EntryExample entryExample=new EntryExample();
        EntryExample.Criteria criteria=entryExample.createCriteria();
        if (!StringUtils.isEmpty(name)){
            criteria.andEntryNameLike("%"+name+"%");
        }
        if (classId!=null){
            if (classId!=0){
                criteria.andTeamIdEqualTo(classId);
            }
        }
        PageHelper.startPage(info.getPageNum(),info.getPageSize());
        List<Entry> list=entryMapper.selectByExample(entryExample);
        return PageInfo.of(list);
    }

    @Override
    public Entry findEntryByUserId(Integer id) {
        EntryExample entryExample=new EntryExample();
        EntryExample.Criteria criteria=entryExample.createCriteria();
        if (id!=null){
            criteria.andUserIdEqualTo(id);
        }
        List<Entry> list=entryMapper.selectByExample(entryExample);
        return list.get(0);
    }

    @Override
    public Boolean updateEntry(Entry entry) {
        return entryMapper.updateByPrimaryKey(entry)>0;
    }

    @Override
    public Boolean addEntry(Entry entry) {
        return entryMapper.insert(entry)>0;
    }

    @Override
    public int statusNumber(Integer status) {
        EntryExample entryExample=new EntryExample();
        EntryExample.Criteria criteria=entryExample.createCriteria();
        criteria.andEntryStatusEqualTo(status);
        List<Entry> list=entryMapper.selectByExample(entryExample);
        return list.size();
    }
}
