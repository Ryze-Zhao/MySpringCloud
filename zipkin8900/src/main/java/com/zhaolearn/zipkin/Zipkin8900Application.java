package com.zhaolearn.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.internal.EnableZipkinServer;




@SpringBootApplication
@EnableZipkinServer
@EnableDiscoveryClient
public class Zipkin8900Application {

    public static void main(String[] args) {
        SpringApplication.run(Zipkin8900Application.class, args);
    }
}
