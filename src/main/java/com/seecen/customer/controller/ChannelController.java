package com.seecen.customer.controller;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Channel;
import com.seecen.customer.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("channel")
public class ChannelController {
    @Autowired
    private ChannelService channelService;

    @RequestMapping("pageList")
    public String pageList(Model model,String channelName, @RequestParam(name = "pageNum",defaultValue = "1")Integer pageNum){
        PageInfo pageInfo = new PageInfo();
        pageInfo.setPageSize(5);
        pageInfo.setPageNum(pageNum);
        pageInfo=channelService.pageChannel(channelName,pageInfo);
        model.addAttribute("info",pageInfo);
        model.addAttribute("channelName",channelName);
        return "marketing/channel/list";
    }
    //拦截添加页面
    @RequestMapping(value = "add",method = RequestMethod.GET)
    public String add(){
        return "marketing/channel/add";
    }

    @RequestMapping(value = "add")
    @ResponseBody
    public String addChannel(Channel channel){
        channelService.addChannel(channel);
        return "1";
    }
    //删除
    @RequestMapping("del/{id}")
    @ResponseBody
    public String delChannel(@PathVariable("id") Integer id){
        channelService.delChannel(id);
        return "1";
    }
    //批量删除
    @RequestMapping(value = "delAll",method = RequestMethod.POST)
    @ResponseBody
    public String delAll(@RequestBody List<Integer> ids){
        channelService.delAll(ids);
        return "1";
    }
    //修改回显
    @RequestMapping("select/{id}")
    public String selectChannel(Model model,@PathVariable("id") Integer id){
        model.addAttribute("channel",channelService.selectChannel(id));
        return "marketing/channel/edit";
    }
    //修改
    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ResponseBody
    public String updateChannel(Channel channel){
        channelService.updateChannel(channel);
        return "1";
    }

    //修改状态
    @RequestMapping(value = "updateFlag/{id}",method = RequestMethod.POST)
    @ResponseBody
    public String updateFlag(@PathVariable("id")Integer id){
        channelService.updateFlag(id);
        return "1";
    }

}
