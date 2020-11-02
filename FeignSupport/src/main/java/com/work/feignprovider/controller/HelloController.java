package com.work.feignprovider.controller;

import com.work.feignprovider.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String index(){
        System.out.println("This is success.");
        return "Success.";
    }

    @RequestMapping("/hellouser")
    @ResponseBody
    public User makeUser(){
        System.out.println("this is hellouser");
        User user = new User();
        user.setName("xiaoming");
        user.setAge(20);
        user.setSex("男");
        return user;
    }
}
