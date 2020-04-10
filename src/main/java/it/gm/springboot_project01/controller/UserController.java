package it.gm.springboot_project01.controller;

import it.gm.springboot_project01.pojo.User;
import it.gm.springboot_project01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * date:2020-04-10
 * author:zhangxiaoshuai
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/addUser")
    public String addUser(User user){

        int i = userService.addUser(user);
//        返回到成功页面
        if (i>0){
            System.out.println("添加成功！");
            return "success";
        }
        System.out.println("添加失败！");
        return "error";
    }


}
