package com.seecen.customer.controller;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Attendance;
import com.seecen.customer.entity.Customer;
import com.seecen.customer.entity.Team;
import com.seecen.customer.service.AttendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("backend/attend")
public class AttendController {

    @Autowired
    private AttendService attendService;

    //遍历
    @GetMapping("list.html")
    public String list(Model model,Integer teamId,String name,@RequestParam(name = "pageNum",
            required = false,defaultValue = "1") Integer pageNum){
        PageInfo<Attendance> info = new PageInfo<>();
        model.addAttribute("name",StringUtils.isEmpty(name)?"":name);
        info.setPageNum(pageNum);
        info.setPageSize(5);
        info = attendService.list(info,teamId,name);
        String error = null;
        if (info==null){
            info = new PageInfo<>();
            info.setPageNum(pageNum);
            info.setPageSize(5);
            info = attendService.list(info,teamId,null);
            error = "对不起，你搜索的学员不存在!";
            model.addAttribute(info);
            List<Attendance> list = attendService.findClass();
            model.addAttribute("class",list);
            model.addAttribute("error",error);
            return "student/attend/attend-list";
        }
        model.addAttribute("error", error);
        model.addAttribute(info);
        List<Attendance> list = attendService.findClass();
        model.addAttribute("class",list);
        return "student/attend/attend-list";
    }

    //查找考勤
    @GetMapping("search.html")
    public String add(Model model,Integer teamId,Date date){
        List<Team> list = attendService.findTeam();
        model.addAttribute("list",list);
        List<Customer> list1 = null;
        if (teamId != null){
            list1 = attendService.findCustomerById(teamId);
        }
        date = new Date();
        model.addAttribute("date",date);
        model.addAttribute("customer",list1);
        return "student/attend/search";
    }

    //根据学员增加考勤
    @GetMapping("add.html/{id}")
    public String add(@PathVariable("id")Integer id,Model model){
       List<Customer> list = attendService.findCustomer(id);
        model.addAttribute("student",list);
        model.addAttribute("time",new Date());
        return "student/attend/attend-add";
    }

    //保存至数据库
    @PostMapping("save.html")
    @ResponseBody
    public String save(Attendance attendance){
        if (attendService.insert(attendance)){
            return "1";
        }
        return "0";
    }

    //按照id进行修改
    @GetMapping("update.html/{id}")
    public String update(@PathVariable("id")Integer id,Model model){
        Attendance attendance = attendService.findAttendanceById(id);
        model.addAttribute("student",attendance);
        return "student/attend/attend-update";
    }

    //修改成功并跳转
    @PostMapping("update.html")
    @ResponseBody
    public String updateAndSave(Attendance attendance){
        if (attendService.update(attendance)){
            return "1";
        }
        return "0";
    }



}
