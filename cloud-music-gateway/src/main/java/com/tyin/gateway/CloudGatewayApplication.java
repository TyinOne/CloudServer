package com.tyin.gateway;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author TyinZero
 * @date 2022/12/27
 * @description ...
 */
@SpringBootApplication(scanBasePackages = {"com.tyin.core","com.tyin.gateway"})
@MapperScan("com.tyin.gateway.repository")
@EnableAsync
public class CloudGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayApplication.class,args);
    }
}
