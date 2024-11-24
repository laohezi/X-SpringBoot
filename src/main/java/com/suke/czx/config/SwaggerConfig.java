package com.suke.czx.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;


@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI(SwaggerProperties swaggerProperties) {
        return new OpenAPI()
                .info(new Info()
                        .title(swaggerProperties.getTitle())
                        .description(swaggerProperties.getDescription())
                        .contact(new Contact()
                                .name(swaggerProperties.getAuthor())
                                .url(swaggerProperties.getUrl())
                                .email(swaggerProperties.getEmail()))
                        .version(swaggerProperties.getVersion()));
    }

    @Bean
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("public")
                .pathsToMatch("/**")
                .packagesToScan("com.suke.czx.modules")
                .build();
    }
}