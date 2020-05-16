package org.example.springframework.aop;

import org.example.springframework.aop.OrderServiceAspect;
import org.example.springframework.aop.OrderService;
import org.example.springframework.aop.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author ruanwenjun
 * @create 2020/05/14/ 5:15 PM
 */
@Configuration
@EnableAspectJAutoProxy
public class AopConfig {

	@Bean
	public OrderService orderService(){
		return new OrderServiceImpl();
	}

	@Bean
	public OrderServiceAspect orderServiceAspect(){
		return new OrderServiceAspect();
	}
}
