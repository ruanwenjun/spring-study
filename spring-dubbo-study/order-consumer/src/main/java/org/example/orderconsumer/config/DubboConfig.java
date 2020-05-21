package org.example.orderconsumer.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ruanwenjun
 * @create 2020/05/18/ 9:37 PM
 */
@Configuration
@EnableDubbo(scanBasePackages = {"org.example.springdubbostudy.orderconsumer.consumerservice"})
@ComponentScan("org.example.springdubbostudy.orderconsumer.consumerservice")
@PropertySource("classpath:spring/dubbo-consumer.properties")
public class DubboConfig {
}
