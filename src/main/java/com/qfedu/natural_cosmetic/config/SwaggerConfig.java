package com.qfedu.natural_cosmetic.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;



@Configuration
public class SwaggerConfig {
    private ApiInfo createAI(){
        return new ApiInfoBuilder().title("自然态度化妆品").description("首页介绍").version("1.0")
                .contact(new Contact("Ws","http://1112","wangsen_0929@163.com")).build();
    }
    @Bean
    public Docket createD(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createAI()).select().apis
                (RequestHandlerSelectors.basePackage("com.qfedu.natural_cosmetic.controller")).build();
    }
}
