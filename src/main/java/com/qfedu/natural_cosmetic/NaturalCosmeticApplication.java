package com.qfedu.natural_cosmetic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.qfedu.natural_cosmetic.dao")
@EnableSwagger2
public class NaturalCosmeticApplication {

    public static void main(String[] args) {
        SpringApplication.run(NaturalCosmeticApplication.class, args);
    }

}
