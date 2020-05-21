package org.example.orderconsumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ruanwenjun
 * @create 2020/05/21/ 9:46 PM
 */
@SpringBootApplication
@EnableDubbo
public class OrderConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderConsumerApplication.class, args);
	}
}
