package com.zhaolearn.consumer.controller;

import com.zhaolearn.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    ConsumerService consumerService;

    @GetMapping(value = "/feignStudy")
    public String sayHi() {
        return consumerService.study()+"my name is feignConsumer9102";
    }

}
