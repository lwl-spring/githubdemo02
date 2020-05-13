package com.cfm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ForumEureka7003Application {

    public static void main(String[] args) {
        SpringApplication.run(ForumEureka7003Application.class, args);
    }

}
