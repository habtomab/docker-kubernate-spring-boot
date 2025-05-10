package com.docker_spring_boot_demo.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
//http://localhost:8080/swagger-ui.html
    @Bean
    public OpenAPI projectOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Project Management API")
                        .description("API for managing projects")
                        .version("1.0"));
    }
}
