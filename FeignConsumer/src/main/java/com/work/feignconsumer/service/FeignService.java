package com.work.feignconsumer.service;

import com.work.feignprovider.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "FEIGNSUPPORT")
public interface FeignService {

    @RequestMapping("/hello")
    String hello();

    @RequestMapping("hello")
    String hello1();

    @RequestMapping("/hellouser")
    User getUser();


}
