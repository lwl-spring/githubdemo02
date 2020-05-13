package com.cfm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@MapperScan("com.cfm.mapper")
@SpringBootApplication
public class ForumProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(ForumProvider8001Application.class, args);
    }

}
