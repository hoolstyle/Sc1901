package com.seecen.customer.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seecen.customer.dao.ChannelMapper;
import com.seecen.customer.entity.Channel;
import com.seecen.customer.entity.ChannelExample;
import com.seecen.customer.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.List;
@Service
public class ChannelServiceImpl implements ChannelService {
    @Autowired
    private ChannelMapper channelMapper;
    @Override
    public List<Channel> listChannel() {
        ChannelExample channelExample = new ChannelExample();
        ChannelExample.Criteria criteria = channelExample.createCriteria();
        criteria.andChannelFlagEqualTo(1);
        return channelMapper.selectByExample(channelExample);
    }

    @Override
    public PageInfo<Channel> pageChannel(String channelName, PageInfo<Channel> pageInfo) {
        ChannelExample channelExample = new ChannelExample();
        ChannelExample.Criteria criteria = channelExample.createCriteria();
        if (!StringUtils.isEmpty(channelName)){
            criteria.andChannelNameLike("%"+channelName+"%");
        }
        PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<Channel> channelList = channelMapper.selectByExample(channelExample);
        return PageInfo.of(channelList);
    }

    @Override
    public Boolean addChannel(Channel channel) {
        if (channelMapper.insert(channel)>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Boolean delChannel(Integer id) {
        if (channelMapper.deleteByPrimaryKey(id)>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Boolean delAll(List<Integer> ids) {
        if (ids.size()>0){
            ChannelExample channelExample = new ChannelExample();
            ChannelExample.Criteria criteria = channelExample.createCriteria();
            criteria.andIdIn(ids);
            channelMapper.deleteByExample(channelExample);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Channel selectChannel(Integer id) {
        return channelMapper.selectByPrimaryKey(id);
    }

    @Override
    public Boolean updateChannel(Channel channel) {
        if (channelMapper.updateByPrimaryKey(channel)>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Boolean updateFlag(Integer id) {
        Channel channel = channelMapper.selectByPrimaryKey(id);
        if (channel!=null){
            if (channel.getChannelFlag()==1){
                channel.setChannelFlag(2);
                channelMapper.updateByPrimaryKey(channel);
            }else {
                channel.setChannelFlag(1);
                channelMapper.updateByPrimaryKey(channel);
            }
            return true;
        }else {
            return false;
        }
    }
}
