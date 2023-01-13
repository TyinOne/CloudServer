package com.tyin.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author TyinZero
 * @date 2022/12/26
 * @description ...
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaApplication.class,args);
    }
}
