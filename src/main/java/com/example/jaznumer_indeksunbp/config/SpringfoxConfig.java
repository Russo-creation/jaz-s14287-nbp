package com.example.jaznumer_indeksunbp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

//config do swaggera żeby się uruchomił

// link do swaggera http://localhost:8080/swagger-ui/#/index.html

public class SpringfoxConfig {

    //bean z Docketem

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo());

    }

    // api info to informacje o aplikacji

    private ApiInfo getApiInfo(){
        return new ApiInfo(
                "Kolokwium Service REST API",
                "Rest API for Kolokwium",
                "PJK 1.0",
                null,
                new Contact("PJATK", "www.google.pl", "s14287@pjwstk.edu.pl"),
                "licence",
                "www.google.pl",
                Collections.emptyList()
        );
    }
}
