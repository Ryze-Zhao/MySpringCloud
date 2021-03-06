package com.zhaolearn.provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Provide9000Application {

    public static void main(String[] args) {
        SpringApplication.run(Provide9000Application.class, args);
    }
}
