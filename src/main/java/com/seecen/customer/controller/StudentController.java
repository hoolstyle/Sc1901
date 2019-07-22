package com.seecen.customer.controller;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Customer;

import com.seecen.customer.entity.Team;
import com.seecen.customer.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import java.util.List;


@Controller
@RequestMapping("/backend")
public class StudentController {

    @Autowired
    private StudentService customerService;

    //遍历学员
    @GetMapping("list.html")
    public String list(Model model, String name,@RequestParam(name = "pageNum",
            required = false,defaultValue = "1") Integer pageNum){
        PageInfo<Customer> info = new PageInfo<>();
        model.addAttribute("name", StringUtils.isEmpty(name)?"":name);
        info.setPageNum(pageNum);
        info.setPageSize(5);
        info = customerService.findCustomerAndTeamByPage(info,name);
        String error = null;
        //如果name为空 info=null
        if (info==null){
            info = new PageInfo<>();
            info.setPageNum(pageNum);
            info.setPageSize(5);
            info = customerService.findCustomerAndTeamByPage(info,null);
            error = "对不起，你搜索的班级不存在!";
            model.addAttribute(info);
            model.addAttribute("error",error);
            return "student/info/admin-list";
        }
        model.addAttribute(info);
        model.addAttribute("error", error);
        return "student/info/admin-list";
    }

    //根据学员id查询个人信息
    @GetMapping("search.html/{id}")
    public String search(@PathVariable("id")Integer id,Model model){
        Customer customer = customerService.findCustomer(id);
        model.addAttribute("customer",customer);
        return "student/info/search";
    }

    //跳转修改页面
    @GetMapping("update.html/{id}")
    public String update(@PathVariable("id")Integer id,Model model){
        Customer customer = customerService.findCustomer(id);
        List<Team> list = customerService.findTeam();
        model.addAttribute("list",list);
        model.addAttribute("customer",customer);
        return "student/info/student-update";
    }

    //保存数据库并返回list页面
    @PostMapping("update.html")
    @ResponseBody
    public String updateCustomer(Customer customer){
        if (customerService.update(customer)){
            return "1";
        }
        return "0";

    }
}
