package org.example.orderconsumer;

import org.example.orderconsumer.consumerservice.OrderConsumer;
import org.example.orderconsumer.config.DubboConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ruanwenjun
 * @create 2020/05/18/ 9:30 PM
 */
public class ConsumerApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DubboConfig.class);
		OrderConsumer orderConsumer = applicationContext.getBean(OrderConsumer.class);
		String result1 = orderConsumer.createOrder(null);
		System.out.println(result1);

	}

}
