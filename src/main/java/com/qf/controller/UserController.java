package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import com.qf.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll(){
        System.out.println("yes");
        return userService.findAll();
    }
//
//    @RequestMapping("/findAll")
//    @ResponseBody
//    public String findAll(){
//        return "success";
//    }
}
