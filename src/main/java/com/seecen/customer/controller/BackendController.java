package com.seecen.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BackendController {
    @RequestMapping("index")
    public String index(){
        return "obtainManager/index";
    }
}
