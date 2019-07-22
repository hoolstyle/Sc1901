package com.seecen.customer.controller;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Center;
import com.seecen.customer.service.CenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("center")
public class CenterController {
    @Autowired
    private CenterService centerService;

    @RequestMapping(value = "list",method = RequestMethod.POST)
    @ResponseBody
    public List<Center> centerList(){
        List response =centerService.centerList();
        return response;
    }

    @RequestMapping("pageList")
    public String pageList(Model model, String centerName, @RequestParam(name = "pageNum",defaultValue = "1")Integer pageNum){
        PageInfo<Center> pageInfo = new PageInfo();
        pageInfo.setPageNum(pageNum);
        pageInfo.setPageSize(5);
        pageInfo = centerService.pageCenter(pageInfo,centerName);
        model.addAttribute("centerName",centerName);
        model.addAttribute("info",pageInfo);
        return "marketing/center/list";
    }
    //拦截添加请求
    @RequestMapping(value = "add",method = RequestMethod.GET)
    public String add(){
        return "marketing/center/add";
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public String addCenter(Center center){
        centerService.addCenter(center);
        return "1";
    }
    @RequestMapping("del/{id}")
    @ResponseBody
    public String del(@PathVariable("id")Integer id){
        centerService.delCenter(id);
        return "1";
    }

    //批量删除
    @RequestMapping(value = "delAll",method = RequestMethod.POST)
    @ResponseBody
    public String delAll(@RequestBody List<Integer> ids){
        centerService.delAllCenter(ids);
        return "1";
    }
    //修改回显
    @RequestMapping(value = "select/{id}",method = RequestMethod.GET)
    public String select(@PathVariable("id") Integer id,Model model){
        model.addAttribute("center",centerService.selCenter(id));

        return "marketing/center/edit";
    }
    //修改
    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ResponseBody
    public String update(Center center){
        centerService.updateCenter(center);
        return "1";
    }
    //修改状态
    @RequestMapping(value = "updateFlag/{id}",method = RequestMethod.POST)
    @ResponseBody
    public String updateFlag(@PathVariable("id")Integer id){
        centerService.updateFlag(id);
        return "1";
    }

    //公司名下的客户
    @RequestMapping(value = "findList/{id}",method = RequestMethod.GET)
    public String findList2(@PathVariable("id")Integer id,Model model,@RequestParam(name = "pageNum",defaultValue = "1")Integer pageNum){
        PageInfo<Center> pageInfo = new PageInfo();
        pageInfo.setPageNum(pageNum);
        pageInfo.setPageSize(5);
        pageInfo = centerService.findList(pageInfo,id);
        for (Center cen:pageInfo.getList()) {
            model.addAttribute("lists",cen.getCustomerList());
        }
        model.addAttribute("page",pageInfo);
        return "marketing/center/list3";
    }

    @RequestMapping("accountExist")
    public void accountCenter(String centerName, HttpServletResponse response) throws IOException {
        response.getWriter().print(centerService.accountCenter(centerName));

    }
}
