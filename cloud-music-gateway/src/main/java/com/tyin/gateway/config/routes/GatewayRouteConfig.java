package com.tyin.gateway.config.routes;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author TyinZero
 * @date 2022/12/27
 * @description ...
 */
@Configuration
public class GatewayRouteConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        // 路由构造器
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        // 设置路径
        routes
                .route("cloud-user-service", r -> r.path("/user/**")
                        .filters(i -> i.stripPrefix(1))
                        .uri("lb://cloud-user"))
                .route("cloud-file-service", r -> r.path("/file/**")
                        .filters(i -> i.stripPrefix(1))
                        .uri("lb://cloud-file"))
                .route("cloud-auth-service", r -> r.path("/auth/**")
                        .filters(i -> i.stripPrefix(1))
                        .uri("lb://cloud-auth"))
        ;
        return routes.build();
    }

}
