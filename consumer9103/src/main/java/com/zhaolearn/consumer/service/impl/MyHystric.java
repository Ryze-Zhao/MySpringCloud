package com.zhaolearn.consumer.service.impl;

import com.zhaolearn.consumer.service.ConsumerService;
import org.springframework.stereotype.Component;



//就是把这个东西（插件）注入到内存等
@Component
public class MyHystric implements ConsumerService {
    @Override
    public String study() {
        return "对唔住，出错了，我是Feign消费者";
    }
}
