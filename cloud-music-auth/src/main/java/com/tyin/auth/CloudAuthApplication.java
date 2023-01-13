package com.tyin.auth;

import com.tyin.core.components.RedisComponents;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author TyinZero
 * @date 2022/12/26
 * @description ...
 */
@SpringBootApplication(scanBasePackages = {"com.tyin.core","com.tyin.auth"})
@EnableFeignClients(basePackages = "com.tyin.api")
public class CloudAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudAuthApplication.class, args);
    }
}
