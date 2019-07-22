package com.seecen.customer.controller;

import com.seecen.customer.entity.Notice;
import com.seecen.customer.service.NoticeService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * @Author 山泊树
 * @create 2019/7/16 10:20
 */
@Controller
public class Filter {

    @Autowired
    private NoticeService noticeService;

    //测试页面，不用认证授权
    @RequestMapping("/hello")
    public  String hello(){
        return "user/index";
    }
    //没有认证跳转的页面
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "/login";
    }

    //没有授权跳转页面
    @RequestMapping("/noAuth")
    public String noAuths(){
        return "user/echarts8";
    }

    //退出接口
    @RequestMapping("/logout")
    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        if (subject!=null){
            subject.logout();
        }
        return "login";
    }

    //首页
    @RequestMapping("/welcome")
    public String welcome(Model model){
        List<Notice> list = noticeService.showNotice();
        model.addAttribute("list",list);
        return "user/welcome";
    }
}
