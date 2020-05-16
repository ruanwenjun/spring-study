package org.example.springframework.condition;

import org.example.springframework.condition.Boss;
import org.example.springframework.condition.Car;
import org.example.springframework.condition.BossCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author ruanwenjun
 * @create 2020/05/13/ 5:46 PM
 */

@Configuration
public class ConditionConfig {


	@Bean
	public Car car() {
		return new Car();
	}

	@Bean
	@Conditional(value = BossCondition.class)
	public Boss boss() {
		return new Boss();
	}
}
