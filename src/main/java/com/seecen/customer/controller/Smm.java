package com.seecen.customer.controller;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Notice;
import com.seecen.customer.entity.Role;
import com.seecen.customer.entity.User;
import com.seecen.customer.service.NoticeService;
import com.seecen.customer.service.RoleService;
import com.seecen.customer.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author 山泊树
 * @create 2019/7/12 16:33
 */
@Controller
public class Smm {
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private NoticeService noticeService;

    //用户分页
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public String users( Model model,
                         @RequestParam(name = "pageNum",required = false, defaultValue = "1")Integer pageNum,
                         String userName,
                         @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date start,
                         @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date end){
        PageInfo<User> info = new PageInfo<>();
        info.setPageNum(pageNum);
        info.setPageSize(5);
        info = userService.findUserByPage(info,userName, start, end);
        model.addAttribute("info",info);
        model.addAttribute("start",start);
        model.addAttribute("end",end);
        model.addAttribute("userName", userName);
        return "user/admin-list";
    }
    //用户添加页面
    @RequestMapping("/user/add")
    public String userAdd(Model model){
       /*List<Role> list = roleService.findRoles();
       model.addAttribute("list",list);*/
        return "user/admin-add";
    }
    //用户添加提交
    @RequestMapping(value = "/user/adds",method = RequestMethod.POST)
    @ResponseBody
    public String userAdds(User user){
        //进行加密
        String salt = getRandomSalt();
        ByteSource credentialsSalt = ByteSource.Util.bytes(salt);
        String Md5String = new Md5Hash( user.getUserPsw(), credentialsSalt, 3).toString();
        user.setUserPsw(Md5String);
        user.setUserSalt(salt);
        if(userService.insertUser(user)){
            return "1";
        }
        return "0";
    }
    public static String getRandomSalt() {
        String model = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuffer salt = new StringBuffer();
        char[] m = model.toCharArray();
        for (int i = 0; i < 6; i++) {
            char c = m[(int) (Math.random() * 36)];
            salt.append(c);
        }
        return salt.toString();
    }

    //单个删除用户
    @RequestMapping("/user/del/{id}")
    @ResponseBody
    public String delById(@PathVariable("id")Integer id){
        if (userService.delUser(id)){
            return "1";
        }
        return "0";
    }
    //修改用户信息
    @RequestMapping("/user/admin-edit/{id}")
    public String updateUser(@PathVariable("id") Integer id,Model model){
        User user = userService.updateById(id);
        model.addAttribute("user",user);
        return "user/admin-edit";
    }
    //用户信息修改后保存
    @RequestMapping(value = "/user/save")
    @ResponseBody
    public String saveUser(User user){
        //MD5加密
        User user1 = userService.md5ByUserId(user.getUserId());
        if (!user1.getUserPsw().equals(user.getUserPsw())){
            String salt = getRandomSalt();
            ByteSource credentialsSalt = ByteSource.Util.bytes(salt);
            String Md5String = new Md5Hash( user.getUserPsw(), credentialsSalt, 3).toString();
            user.setUserPsw(Md5String);
            user.setUserSalt(salt);
        }
        if (userService.saveUser(user)){
            return "1";
        }
        return "0";
    }



    //角色分页
    @RequestMapping(value = "/roles",method = RequestMethod.GET)
    public String roles(
            Model model,
            @RequestParam(name = "pageNum",required = false, defaultValue = "1")Integer pageNum,
            String roleName,
            String roleDescription){
        PageInfo<Role> info = new PageInfo<>();
        info.setPageNum(pageNum);
        info.setPageSize(5);
        info = roleService.findRoleByPage(info,roleName,roleDescription);
        model.addAttribute("info",info);
        model.addAttribute("roleDescription",roleDescription);
        model.addAttribute("roleName", roleName);
        return "user/admin-role";
    }
    /*//角色添加
    public String*/



    //公告管理
    @RequestMapping("/notice")
    public String showNotice(Model model,
                             @RequestParam(name = "pageNum",required = false, defaultValue = "1")Integer pageNum,
                             String nTitle,
                             @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date start,
                             @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date end){
        PageInfo<Notice> info = new PageInfo<>();
        info.setPageNum(pageNum);
        info.setPageSize(5);
        info = noticeService.findNoticeByPage(info,nTitle, start, end);
        model.addAttribute("info",info);
        model.addAttribute("start",start);
        model.addAttribute("end",end);
        model.addAttribute("nTitle", nTitle);
        return "user/member-list";
    }
    //发布公告
    @RequestMapping("/order-add")
    public String bulletin(HttpSession session){
        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        session.setAttribute("user",user.getUserName());
        return "user/order-add";
    }
    @RequestMapping("/notice/adds")
    @ResponseBody
    public String noticeAdds(Notice notice){
        if (noticeService.addNotice(notice)){
            return "1";
        }
        return "0";
    }




    //权限分页
    @RequestMapping(value = "/permissions",method = RequestMethod.GET)
    public String permissions(){
        return "user/admin-rule";
    }





    //登陆的过滤
    @RequestMapping(value = "/users/login")
    public String login(@RequestParam(value = "userName",required = false)String userName,
                        @RequestParam(value = "userPsw",required = false)String userPsw,
                        HttpSession session, Model model){
        //进行加密之后比对密码
        User user = userService.findByName(userName);
        String Md5String = new Md5Hash( userPsw, user.getUserSalt(), 3).toString();

       /* *
         * 进行用户认证
         * 1、获取subject*/
      Subject subject = SecurityUtils.getSubject();
      //2、封装用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(userName,Md5String);
        //3、执行登录方法,没有异常就是登录成功
        try {
            subject.login(token);
           User user1 = (User) subject.getPrincipal();
            session.setAttribute("user",user1);
            return "user/index";
        }catch (UnknownAccountException e){
            //登录失败，是因为用户名不存在
            model.addAttribute("msg","户名不存在");
            return "login";
        }catch(IncorrectCredentialsException e){
            //登录失败：是因为密码错误
            model.addAttribute("msg","账号或密码错误");
            return "login";
        }
    }
}
