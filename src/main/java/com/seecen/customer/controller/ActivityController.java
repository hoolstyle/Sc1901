package com.seecen.customer.controller;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Activity;
import com.seecen.customer.entity.Team;
import com.seecen.customer.service.ActivityService;
import com.seecen.customer.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("activity")
public class ActivityController {

    @Autowired
    private ActivityService activityService;



    @RequestMapping("list")
    public String list(@RequestParam(name = "pageNum" ,defaultValue = "1") Integer pageNum, Model model){
       PageInfo<Activity> info=new PageInfo<>();
       info.setPageNum(pageNum);
       info.setPageSize(5);
       info=activityService.findActivityByPage(info);
       model.addAttribute("info",info);
        return "classReview/activity/list";
    }

    @RequestMapping("findList")
    public String list(@RequestParam(name = "pageNum",defaultValue = "1")Integer pageNum, Model model,String teamName){
        PageInfo<Activity> info=new PageInfo<>();
        info.setPageSize(5);
        info.setPageNum(pageNum);
        info=activityService.findActivityByTeam(info,teamName);
        model.addAttribute("info",info);
        model.addAttribute("teamName",teamName);
        return "classReview/activity/actList";
    }

    @Autowired
    private TeamService teamService;
    @RequestMapping("showAdd")
    public String addAct(Model model){
        List<Team> list=teamService.findTeam();
        model.addAttribute("list",list);
        return "classReview/activity/add";
    }

    @RequestMapping("showUpdate/{id}")
    public String updateAct(@PathVariable("id") Integer id,Model model){
        List<Team> list=teamService.findTeam();
        Activity activity=activityService.findActivityById(id);
        model.addAttribute("list",list);
        model.addAttribute("activity",activity);
        return "classReview/activity/update";
    }


    @RequestMapping("saveOrUpdate")
    @ResponseBody
    public String saveOrUpdate(Activity activity){
        if(activity.getActId()!=null){
            //修改操作
            if(activityService.updateAct(activity)){
                return "1";
            }else {
                return "2";
            }
        }else {
            //添加操作
            if(activityService.addAct(activity)){
                return "1";
            }else {
                return "2";
            }
        }
    }

    @RequestMapping("del/{id}")
    @ResponseBody
    public String delAct(@PathVariable("id") Integer id){
        activityService.delAct(id);
        return "1";
    }



}
