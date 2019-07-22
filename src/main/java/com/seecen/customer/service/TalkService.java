package com.seecen.customer.service;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Talk;

public interface TalkService {
    PageInfo<Talk> findCustomerAndTeamByPage(PageInfo<Talk> info, String name);
}
