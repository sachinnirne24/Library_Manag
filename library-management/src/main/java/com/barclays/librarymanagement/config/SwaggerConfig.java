package com.barclays.librarymanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
    public Docket LibraryApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.barclays.librarymanagement.controller"))
                .paths(regex("/api/library.*"))
                .build()
                .apiInfo(metaData());
    }
    private ApiInfo metaData() {
        ApiInfo apiInfo = new ApiInfo(
                "Spring Boot REST API for Library",
                "Spring Boot REST API for Library Store",
                "1.0",
                "Terms of service",
                new Contact("sachin nirne", "", "sachinnirne24@gmail.com"),
               "",
                "");
        return apiInfo;
    }
}