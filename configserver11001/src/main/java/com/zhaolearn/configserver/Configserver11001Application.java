package com.zhaolearn.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
@EnableDiscoveryClient
public class Configserver11001Application {

    public static void main(String[] args) {
        SpringApplication.run(Configserver11001Application.class, args);
    }
}
