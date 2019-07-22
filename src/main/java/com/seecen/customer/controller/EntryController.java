package com.seecen.customer.controller;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Entry;
import com.seecen.customer.entity.Team;
import com.seecen.customer.service.EntryService;
import com.seecen.customer.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/entry")
public class EntryController {
    @Autowired
    private EntryService entryService;
    @Autowired
    private TeamService teamService;

    @RequestMapping("list")
    public String list(String username,
                       Model model,
             @RequestParam(value = "pageNum",required = false,defaultValue = "1")Integer pageNum,
             @RequestParam(value = "classId",required = false,defaultValue = "0")Integer classId          ){
        PageInfo<Entry> info=new PageInfo<>();
        info.setPageSize(5);
        info.setPageNum(pageNum);
        info=entryService.findEntryByPage(info,username,classId);
        int a=entryService.statusNumber(0);
        int b=entryService.statusNumber(1);
        int c=entryService.statusNumber(2);
        List<Team> list=teamService.findTeam();
        model.addAttribute("info",info);
        model.addAttribute("class",list);
        model.addAttribute("classId",classId);
        model.addAttribute("name",username);
        model.addAttribute("a",a);
        model.addAttribute("b",b);
        model.addAttribute("c",c);
        return "obtainManager/entry/list";
    }
}
