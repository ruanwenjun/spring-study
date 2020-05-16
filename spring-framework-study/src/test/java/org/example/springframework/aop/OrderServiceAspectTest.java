package org.example.springframework.aop;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ruanwenjun
 * @create 2020/05/14/ 5:17 PM
 */
public class OrderServiceAspectTest {


	@Test
	public void testSuccess() throws Exception {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
		OrderService orderService = applicationContext.getBean(OrderService.class);
		String orderId = orderService.create(1);
		System.out.println(orderId);
	}
}
