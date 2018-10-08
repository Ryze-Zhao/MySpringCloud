package com.zhaolearn.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Configserver11000Application {

    public static void main(String[] args) {
        SpringApplication.run(Configserver11000Application.class, args);
    }
}
