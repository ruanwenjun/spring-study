package org.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author ruanwenjun
 * @create 2020/04/19/ 8:48 PM
 */
@SpringBootApplication
@EnableSwagger2
public class Order8002Application {
    public static void main(String[] args) {
        SpringApplication.run(Order8002Application.class, args);
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("org.example.springcloud.controller"))
            .paths(PathSelectors.any())
            .build();
    }
}
