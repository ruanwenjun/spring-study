package org.example.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ruanwenjun
 * @create 2020/04/19/ 8:49 PM
 */
@Configuration
public class RestTemplateConfiguration {

    public static final String PAYMENT_SERVICE_NAME = "PAYMENT-SERVICE";

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
