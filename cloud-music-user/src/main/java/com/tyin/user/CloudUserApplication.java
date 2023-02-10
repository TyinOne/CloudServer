package com.tyin.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author TyinZero
 * @date 2022/12/27
 * @description ...
 */
@SpringBootApplication(scanBasePackages = {"com.tyin.core", "com.tyin.user"})
@MapperScan("com.tyin.user.repository")
public class CloudUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudUserApplication.class, args);
    }
}
