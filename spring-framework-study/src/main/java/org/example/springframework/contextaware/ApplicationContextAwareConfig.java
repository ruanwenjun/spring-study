package org.example.springframework.contextaware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ruanwenjun
 * @create 2020/05/14/ 11:46 AM
 */
@Configuration
public class ApplicationContextAwareConfig {

	@Bean
	public ContextBean contextBean() {
		return new ContextBean();
	}
}
