package com.zhaolearn.consumer.controller;

import com.zhaolearn.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;

    @Value("${myname}")
    String myname;
    @Value("${age}")
    String age;

    @RequestMapping(value = "/testConfig")
    public String testConfig(){
        return myname+"----"+age;
    }



    @GetMapping(value = "/consumerProvide")
    public String useProvideController() {
        return consumerService.useProvideService()+"my name is consumer9100";
    }

}
