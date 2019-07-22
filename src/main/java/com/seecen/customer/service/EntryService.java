package com.seecen.customer.service;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Entry;
import org.springframework.stereotype.Service;


public interface EntryService {
    PageInfo<Entry> findEntryByPage(PageInfo<Entry> info,String name,Integer classId);
    Entry findEntryByUserId(Integer id);
    Boolean updateEntry(Entry entry);
    Boolean addEntry(Entry entry);
    int statusNumber(Integer status);
}
