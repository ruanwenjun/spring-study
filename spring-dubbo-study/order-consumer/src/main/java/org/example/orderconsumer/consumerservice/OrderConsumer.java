package org.example.orderconsumer.consumerservice;

import org.apache.dubbo.config.annotation.Reference;
import org.example.orderspi.bean.CommonResult;
import org.example.orderspi.bean.Order;
import org.example.orderspi.orderspi.OrderSpi;
import org.springframework.stereotype.Component;

/**
 * @author ruanwenjun
 * @create 2020/05/18/ 9:30 PM
 */
@Component
public class OrderConsumer {

	@Reference
	private OrderSpi orderSpi;


	public String createOrder(Order order) {
		CommonResult<String> result = orderSpi.createOrder(order);
		return result.getMessage();
	}
}
