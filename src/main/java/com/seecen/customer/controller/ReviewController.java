package com.seecen.customer.controller;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Customer;
import com.seecen.customer.entity.Review;
import com.seecen.customer.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("review")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;


    @RequestMapping("list")
    public String list(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum, Model model,String userName){
        PageInfo<Review> info=new PageInfo<>();
        info.setPageSize(5);
        info.setPageNum(pageNum);
        info=reviewService.findReviewByPage(info,userName);
        model.addAttribute("info",info);
        model.addAttribute("userName",userName);
        return "classReview/review/list";
    }



    @RequestMapping("showAdd")
    public String showAdd(Model model){
        List<Customer> list=reviewService.findStudent();
        model.addAttribute("list",list);
        return "classReview/review/add";
    }



    @RequestMapping("bindingTeam/{id}")
    @ResponseBody
    public Customer bindingTeam(@PathVariable("id") Integer id){
        Customer customer=reviewService.findStudentById(id);
        return customer;
    }

    @RequestMapping("showUpdate/{id}")
    public String showUpdate(@PathVariable("id")Integer id,Model model){
        Review review=reviewService.findReviewById(id);
        model.addAttribute("review",review);
        return "classReview/review/update";
    }

    @RequestMapping("saveOrUpdate")
    @ResponseBody
    public String addReview(Review review){
        if(review.getReviewId()!=null){
            //修改操作
            if(reviewService.updateReview(review)){
                return "1";
            }else {
                return "2";
            }
        }else {
            //添加操作
            if(reviewService.addReview(review)){
                return "1";
            }else {
                return "2";
            }

        }
    }
}
