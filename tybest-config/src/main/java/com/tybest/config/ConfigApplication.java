package com.tybest.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author tb
 * @date 2018/11/30 14:05
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
