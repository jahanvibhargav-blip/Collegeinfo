package com.example.demo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
@Configuration
public class CorsConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(
            org.springframework.data.rest.core.config.RepositoryRestConfiguration config,
            CorsRegistry cors) {
        cors.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*");
    }
}

