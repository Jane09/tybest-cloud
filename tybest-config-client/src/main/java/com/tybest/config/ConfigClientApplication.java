package com.tybest.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author tb
 * @date 2018/11/30 14:21
 */
@SpringBootApplication
public class ConfigClientApplication implements CommandLineRunner {



    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
