package com.apexengineeringhub.platform.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for OpenAPI and Swagger UI.
 */
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI apexPlatformOpenAPI(){
        Info info = new Info().title("APEX Platform API")
                .version("v1.0")
                .description("Engineering Growth Platform built with Spring Boot.");
      return new OpenAPI().info(info);
    }


}
