package com.seecen.customer.controller;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.dao.TalkDao;
import com.seecen.customer.dao.TalkMapper;
import com.seecen.customer.entity.Talk;
import com.seecen.customer.service.TalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("backend/talk")
public class TalkController {

    @Autowired
    private TalkService talkService;

    @GetMapping("list.html")
    public String list(Model model, String name, @RequestParam(name = "pageNum",
            required = false,defaultValue = "1") Integer pageNum){
        PageInfo<Talk> info = new PageInfo<>();
        info.setPageNum(pageNum);
        info.setPageSize(2);
        info = talkService.findCustomerAndTeamByPage(info,name);
        model.addAttribute(info);
        return "student/talk/talk-list";
    }
}
