package com.yellowsunn.homeconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HomeConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeConfigServerApplication.class, args);
    }

}
