package com.seecen.customer.service;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Channel;

import java.util.List;

public interface ChannelService {
    //遍历
    public List<Channel> listChannel();
    //分页
    public PageInfo<Channel> pageChannel(String channelName,PageInfo<Channel> pageInfo);
    //添加
    public Boolean addChannel(Channel channel);
    //删除
    public Boolean delChannel(Integer id);
    //批量删除
    public Boolean delAll(List<Integer> ids);
    //修改回显
    public Channel selectChannel(Integer id);
    //修改
    public Boolean updateChannel(Channel channel);
    //修改状态
    public Boolean updateFlag(Integer id);
}
