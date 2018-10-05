package com.zhaolearn.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//这是是另外一个服务的名字
@FeignClient(name = "Provide9000",fallback = MyHystric.class)
public interface ConsumerService {

    //这意思是指向服务名字Provide9000（这个是eureka注册名字，包含有provide9000和provide9001）的study
    @RequestMapping("/study")
    public String study();
}
