package com.tyin.file.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
//import org.springdoc.core.properties.SwaggerUiConfigParameters;
//import org.springdoc.core.providers.ActuatorProvider;
//import org.springdoc.webmvc.ui.SwaggerIndexTransformer;
//import org.springdoc.webmvc.ui.SwaggerWebMvcConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author TyinZero
 * @date 2022/12/27
 * @description ...
 */
@Configuration
public class SwaggerConfig {
//    SwaggerResourcesProvider
@Bean
public GroupedOpenApi clientApi() {

    return GroupedOpenApi.builder()
            .group("fkqd-client")
            .packagesToScan("com.linzhi.client")
            .build();
}
}
