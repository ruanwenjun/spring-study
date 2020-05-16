package org.example.springframework.processor;

import org.example.springframework.bean.Cat;
import org.example.springframework.processor.MyBeanPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ruanwenjun
 * @create 2020/05/11/ 7:39 PM
 */
@Configuration
public class BeanPostProcessorConfig {

	@Bean
	public Cat cat() {
		return new Cat("Tom", 1);
	}

	@Bean
	public BeanPostProcessor myBeanPostProcessor() {
		return new MyBeanPostProcessor();
	}
}
