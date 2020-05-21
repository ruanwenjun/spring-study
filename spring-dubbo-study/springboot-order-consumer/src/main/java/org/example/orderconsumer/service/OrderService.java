package org.example.orderconsumer.service;

import org.apache.dubbo.config.annotation.Reference;
import org.example.orderspi.bean.CommonResult;
import org.example.orderspi.bean.Order;
import org.example.orderspi.orderspi.OrderSpi;
import org.springframework.stereotype.Service;

/**
 * @author ruanwenjun
 * @create 2020/05/21/ 10:03 PM
 */

@Service
public class OrderService implements OrderSpi {

	@Reference
	private OrderSpi orderSpi;

	@Override
	public CommonResult<String> createOrder(Order order) {
		return orderSpi.createOrder(order);
	}
}
