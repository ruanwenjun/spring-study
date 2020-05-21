package org.example.orderprovider.config;

import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ruanwenjun
 * @create 2020/05/18/ 7:56 PM
 */
@Configuration
@EnableDubbo(scanBasePackages = "org.example.springdubbostudy.orderprovider.orderservice")
@PropertySource("classpath:/spring/dubbo-provider.properties")
public class DubboConfig {

	@Bean
	public RegistryConfig registryConfig() {
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress("zookeeper://127.0.0.1:2181");
		return registryConfig;
	}

}
