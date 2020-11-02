package com.work.feignconsumer.controller;

import com.work.feignconsumer.service.FeignService;
import com.work.feignprovider.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    public FeignService feignService;


    @RequestMapping("/say")
    @ResponseBody
    public String sayHello(){
        return feignService.hello();
    }

    @RequestMapping("/say1")
    @ResponseBody
    public String sayHello1(){
        return feignService.hello1();
    }

    @RequestMapping("/sayuser")
    @ResponseBody
    public User sayUser(){
        return feignService.getUser();
    }
}
