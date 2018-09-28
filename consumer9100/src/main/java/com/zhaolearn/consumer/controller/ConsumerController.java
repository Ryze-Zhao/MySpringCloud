package com.zhaolearn.consumer.controller;

import com.zhaolearn.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping(value = "/consumerProvide")
    public String useProvideController() {
        return consumerService.useProvideService();
    }

}
