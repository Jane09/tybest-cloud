package com.tybest.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * @author tb
 * @date 2018/11/30 15:17
 */
@RestController
public class HelloController {

    @Value("${tybest.hello}")
    private String hello;

    @PostConstruct
    public void init(){
        System.out.println(hello);
    }
}
