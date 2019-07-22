package com.seecen.customer.controller;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Company;
import com.seecen.customer.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

//    公司的list方法
    @RequestMapping("list")
    public String list(String comName,
                       @RequestParam(value = "pageNum",defaultValue = "1",required = false)Integer pageNum,
                       Model model){
        PageInfo<Company> info=new PageInfo<>();
        info.setPageNum(pageNum);
        info.setPageSize(5);
        info=companyService.findCompanyByPage(info,comName);
        model.addAttribute("info",info);
        model.addAttribute("comName",comName);
        return "obtainManager/company/list";
    }

//    修改获取公司的回显值
    @RequestMapping(value = "update/{id}",method = RequestMethod.GET)
    public String update(@PathVariable("id")Integer id,Model model){
        model.addAttribute("company",companyService.findCompanyById(id));
        return "obtainManager/company/edit";
    }

//    提交修改信息
    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ResponseBody
    public String update(Company company){
        if (companyService.updateCompany(company)){
            return "1";
        }else {
            return "0";
        }
    }
    //公司的添加
    @RequestMapping(value = "add",method = RequestMethod.GET)
    public String add(){
        return "obtainManager/company/add";
    }
    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public String add(Company company){
        if (companyService.addCompany(company)) {
            return "1";
        }else {
            return "0";
        }
    }
    @RequestMapping("del/{id}")
    @ResponseBody
    public String del(@PathVariable(name = "id")Integer id){
        if (companyService.delCompany(id)){
            return "1";
        }else {
            return "0";
        }

    }
}
