package com.seecen.customer.controller;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.dao.CompanyMapper;
import com.seecen.customer.entity.Company;
import com.seecen.customer.entity.Entry;
import com.seecen.customer.entity.Interview;
import com.seecen.customer.entity.Result;
import com.seecen.customer.service.EntryService;
import com.seecen.customer.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/view")
public class ViewController {
    @Autowired
    private ViewService viewService;
    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    private EntryService entryService;

    //面试信息的list
    @RequestMapping("/list")
    public String list(Model model,
                       Integer viewStatus,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") Date start,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") Date end,
                       @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                       String userName){
        PageInfo<Interview> info=new PageInfo<>();
        info.setPageNum(pageNum);
        info.setPageSize(5);
        info=viewService.findViewByPage(viewStatus,userName,start,end,pageNum,info);
        model.addAttribute("info",info);
        model.addAttribute("start",start);
        model.addAttribute("end",end);
        model.addAttribute("name",userName);
        model.addAttribute("viewStatus",viewStatus);
        return "obtainManager/view/list";
    }

    //添加面试信息
    @RequestMapping(value = "add",method = RequestMethod.GET)
    public String add(Model model){
        //遍历公司的信息
        List<Company> list=companyMapper.selectByExample(null);
        model.addAttribute("list",list);
        return "obtainManager/view/add";
    }
    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public String add(Interview interview){
        if (viewService.addView(interview)){
            Entry entry=entryService.findEntryByUserId(interview.getUserId());
            entry.setEntryStatus(1);
            entry.setRemark(interview.getRemark());
            entryService.updateEntry(entry);
                return "1";
        }else {
            return "0";
        }
    }

    //获取update回显的信息
    @RequestMapping(value = "update/{id}",method = RequestMethod.GET)
    public String update(@PathVariable("id")Integer id,Model model){
        List<Company> list=companyMapper.selectByExample(null);
        model.addAttribute("list",list);
        model.addAttribute("view",viewService.findViewById(id));
        return "obtainManager/view/edit";
    }

    //对面试进行update
    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ResponseBody
    public String update(Interview interview){
              if (viewService.updateView(interview)){
                  if (interview.getConStatus()==2){
                      Entry entry=entryService.findEntryByUserId(interview.getUserId());
                      entry.setEntryStatus(2);
                      entry.setRemark(interview.getRemark());
                      entryService.updateEntry(entry);
                  }else if (interview.getConStatus()==1){
                      Entry entry=entryService.findEntryByUserId(interview.getUserId());
                      entry.setEntryStatus(0);
                      entryService.updateEntry(entry);
                  }
              return "1";
          }else {
              return "0";
          }
    }
    @RequestMapping("del/{id}")
    @ResponseBody
    public String del(@PathVariable("id")Integer id){
        if (viewService.delView(id)){
            return "1";
        }else {
            return "0";
        }
    }
    @RequestMapping("exist/{id}")
    @ResponseBody
    public Result idExist(@PathVariable("id")Integer id,Model model){
        int a=1;
        try {
            Entry entry=entryService.findEntryByUserId(id);
        }catch (Exception e){
             a=0;
        }
        if (a==0){
            return Result.error("该学生不存在");//该用户不存在
        }else if (entryService.findEntryByUserId(id).getEntryStatus()!=0){
            return Result.error("该学生已存在公司");//该用户已经有面试公司
        }else {
            return Result.success(entryService.findEntryByUserId(id).getEntryName());//该用户可以添加
        }
    }
}
