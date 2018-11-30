package com.tybest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author tb
 * @date 2018/11/30 14:05
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class);
    }

    @Value("${tybest.hello}")
    private String hello;


    @Override
    public void run(String... args) throws Exception {
        System.out.println(hello);
    }
}
