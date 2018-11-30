package com.tybest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author tb
 * @date 2018/11/30 14:21
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication implements CommandLineRunner {

//    @Value("${tybest.hello}")
    private String hello;

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(hello);
    }
}
