package com.tyin.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.stereotype.Component;

import static com.tyin.core.constants.SecurityConstants.IGNORE;

/**
 * @author TyinZero
 * @date 2022/12/29
 * @description ...
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    SecurityFilterChain webFluxSecurityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .cors().and()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
                .authorizeHttpRequests()
//                .requestMatchers(HttpMethod.OPTIONS).permitAll()
//                .requestMatchers(IGNORE).permitAll()
                .anyRequest()
                .permitAll()
        ;
        return http.build();
    }
}
