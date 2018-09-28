package com.zhaolearn.provide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProvideController {

    @GetMapping("/study")
    public String learn() {
        return "good good study , day day up,my name is provide9000 o";
    }

}
