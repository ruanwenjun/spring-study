package org.example.springframework.beanfactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ruanwenjun
 * @create 2020/05/16/ 10:31 PM
 */
@Configuration
@ComponentScan(value = "org.example.springframework.beanfactory")
public class BeanFactoryPostProcessorConfig {

	@Bean
	public Car car() {
		return new Car("car");
	}
}
