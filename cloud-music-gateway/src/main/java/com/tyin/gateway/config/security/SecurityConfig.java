//package com.tyin.gateway.config.security;
//
//import com.tyin.gateway.config.security.handler.AuthenticationSuccessHandler;
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//
///**
// * @author TyinZero
// * @date 2022/12/28
// * @description ...
// */
//@EnableWebFluxSecurity
//@RequiredArgsConstructor
//public class SecurityConfig {
//    private final AuthenticationSuccessHandler authenticationSuccessHandler;
//    /**
//     * 白名单
//     */
//    private static final String[] EXCLUDED_AUTH_PAGES = {
//            "/auth/login",
//            "/auth/logout",
//            "/common/**",
//            "/doc.html"
//    };
//
//    @Bean
//    SecurityWebFilterChain webFluxSecurityFilterChain(ServerHttpSecurity http) throws Exception {
//        http
//                .authorizeExchange()
//                .pathMatchers(EXCLUDED_AUTH_PAGES).permitAll()
//                .pathMatchers(HttpMethod.OPTIONS).permitAll()
//                .anyExchange().authenticated()
//                .and()
//                .httpBasic()
//                .and()
//                .formLogin()
//                .loginPage("/auth/login")
//                .authenticationSuccessHandler(authenticationSuccessHandler)
//                .and().csrf().disable()
//                .logout().disable();
//
//        return http.build();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder(BCryptPasswordEncoder bCryptPasswordEncoder) {
//        return bCryptPasswordEncoder;
//    }
//}
