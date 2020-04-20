package org.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author ruanwenjun
 * @create 2020/04/18/ 6:16 PM
 */
@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
public class Payment8001Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment8001Application.class, args);
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
