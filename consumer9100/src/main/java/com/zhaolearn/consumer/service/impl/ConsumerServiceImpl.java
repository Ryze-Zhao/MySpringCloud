package com.zhaolearn.consumer.service.impl;

import com.zhaolearn.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    //这是Provide9000的yml配置的名字
    private static final String SERVICE_NAME = "Provide9000";

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String useProvideService() {
            return restTemplate.getForObject("http://"+SERVICE_NAME+"/study",String.class);
    }
}
