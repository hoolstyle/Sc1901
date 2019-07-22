package com.seecen.customer.controller;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Customer;
import com.seecen.customer.service.CenterService;
import com.seecen.customer.service.ChannelService;
import com.seecen.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private CenterService centerService;

    @Autowired
    private ChannelService channelService;


    //客户分页遍历
    @RequestMapping("pageList")
    public String pageList(Model model,String customerName, @DateTimeFormat(pattern = "yyyy-MM-dd") Date start,@DateTimeFormat(pattern = "yyyy-MM-dd") Date end,@RequestParam(name = "pageNum",defaultValue = "1") Integer pageNum,Integer channelId,Integer centerId){
        PageInfo<Customer> info = new PageInfo();
        info.setPageNum(pageNum);
        info.setPageSize(5);
        info = customerService.pageCustomer(info,customerName,start,end,channelId,centerId);
        model.addAttribute("info",info);
        model.addAttribute("customerName",customerName);
        model.addAttribute("start",start);
        model.addAttribute("end",end);
        model.addAttribute("center",centerService.centerList());
        model.addAttribute("channel",channelService.listChannel());
        return "marketing/customer/list";
    }
//    学生遍历
    @RequestMapping("pageList2")
    public String pageList2(Model model,String customerName, @DateTimeFormat(pattern = "yyyy-MM-dd") Date start,@DateTimeFormat(pattern = "yyyy-MM-dd") Date end,@RequestParam(name = "pageNum",defaultValue = "1") Integer pageNum,Integer channelId,Integer centerId){
        PageInfo<Customer> info = new PageInfo();
        info.setPageNum(pageNum);
        info.setPageSize(5);
        info = customerService.pageCustomer2(info,customerName,start,end,channelId,centerId);
        model.addAttribute("info",info);
        model.addAttribute("customerName",customerName);
        model.addAttribute("start",start);
        model.addAttribute("end",end);
        model.addAttribute("center",centerService.centerList());
        model.addAttribute("channel",channelService.listChannel());
        return "marketing/customer/list";
    }

    //拦截添加请求
    @RequestMapping(value = "add",method = RequestMethod.GET)
    public String add(Model model){ ;
        model.addAttribute("center",centerService.centerList());
        model.addAttribute("channel",channelService.listChannel());
        return "marketing/customer/add";
    }
    //添加
    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public String addCustomer(Customer customer){
        customerService.addCustomer(customer);
        return "1";
    }
    //删除
    @RequestMapping(value = "delete/{customerId}",method = RequestMethod.POST)
    @ResponseBody
    public String deleteCustomer(@PathVariable("customerId") Integer customerId){
        customerService.delCustomer(customerId);
        return "1";
    }
    //批量删除
    @RequestMapping(value = "delAll",method = RequestMethod.POST)
    @ResponseBody
    public String delAllCustomer(@RequestBody List<Integer> ids){
        if (customerService.delAll(ids)){
            return "1";
        }else {
            return "2";
        }
    }

    //查询回显
    @RequestMapping(value = "select/{customerId}",method = RequestMethod.GET)
    public String selectCustomer(@PathVariable("customerId")Integer customerId,Model model){
        model.addAttribute("customer",customerService.selectCustomer(customerId));
        model.addAttribute("center",centerService.centerList());
        model.addAttribute("channel",channelService.listChannel());
        return "marketing/customer/edit";
    }

    //修改
    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ResponseBody
    public String updateCustomer(Customer customer){
        customerService.updateCustomer(customer);
        return "1";
    }

    //修改状态
    @RequestMapping(value = "updateFlag/{customer}",method = RequestMethod.POST)
    @ResponseBody
    public String updateFlag(@PathVariable("customer") Integer customerId){
        customerService.updateFlag(customerId);
        return "1";
    }

}
