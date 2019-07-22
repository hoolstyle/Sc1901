package com.seecen.customer.controller;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Customer;
import com.seecen.customer.entity.Team;
import com.seecen.customer.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("team")
public class TeamController {

    @Autowired
    private TeamService teamService;



    @RequestMapping("list")
    public String list(@RequestParam(name = "pageNum",defaultValue = "1" ) Integer pageNum,Model model,
                       String teamName,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") Date start,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") Date end){
        PageInfo<Team> info=new PageInfo<>();
        info.setPageSize(5);
        info.setPageNum(pageNum);
        info=teamService.findTeamByPage(teamName,info,start,end);
        model.addAttribute("info",info);
        model.addAttribute("start",start);
        model.addAttribute("end",end);
        model.addAttribute("teamName",teamName);
        return "classReview/team/list";
    }

    @RequestMapping("showAdd")
    public String showAdd(){
        return "classReview/team/add";
    }

    @RequestMapping("showUpdate/{id}")
    public String showUpdate(@PathVariable("id") Integer id,Model model){
        Team team=teamService.findTeamById(id);
        model.addAttribute("team",team);
        return "classReview/team/update";
    }


    @RequestMapping("saveOrUpdate")
    @ResponseBody
    public String saveOrUpdate(Team team){
        if(team.getTeamId()!=null){
            //修改操作
            if(teamService.updateTeam(team)){
                return "1";
            }else {
                return "2";
            }
        }else {
            //添加操作
            if(teamService.addTeam(team)){
                return "1";
            }else {
                return "2";
            }
        }
    }

    @RequestMapping("del/{id}")
    @ResponseBody
    public String del(@PathVariable("id") Integer id){
        teamService.delTeam(id);
        return "1";
    }

    @RequestMapping("findStudent")
    public String findStudent(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum, Model model,String customerName){
      PageInfo<Customer> info=new PageInfo<>();
      info.setPageNum(pageNum);
      info.setPageSize(5);
      info=teamService.findStudentByPage(customerName,info);
      model.addAttribute("info",info);
      model.addAttribute("customerName",customerName);
      return "classReview/team/studentList";
    }


    @RequestMapping("showStudent/{id}")
    public String showStudent(@PathVariable("id")Integer id,Model model){
        Customer customer=teamService.findStudentById(id);
        List<Team> team=teamService.findTeam();
        model.addAttribute("stu",customer);
        model.addAttribute("list",team);
        return "classReview/team/addStudent";
    }

    @RequestMapping("addStudent")
    @ResponseBody
    public String addStudent(Customer customer){
        if(customer.getCustomerId()!=null){
            if(teamService.addStudent(customer)){
                return "1";
            }else {
                return "2";
            }
        }
        return null;
    }
}
