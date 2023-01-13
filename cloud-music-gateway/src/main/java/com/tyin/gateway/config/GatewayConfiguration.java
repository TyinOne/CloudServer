package com.tyin.gateway.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@RequiredArgsConstructor
public class GatewayConfiguration {
//    @Bean
//    public GlobalExceptionHandler globalExceptionHandler() {
//        return new GlobalExceptionHandler(requestLogComponents);
//    }
}
