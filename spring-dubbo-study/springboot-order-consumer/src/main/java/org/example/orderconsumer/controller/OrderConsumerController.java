package org.example.orderconsumer.controller;

import org.example.orderspi.bean.CommonResult;
import org.example.orderspi.bean.Order;
import org.example.orderspi.bean.Product;
import org.example.orderspi.orderspi.OrderSpi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author ruanwenjun
 * @create 2020/05/21/ 10:01 PM
 */
@RestController
public class OrderConsumerController {

	@Autowired
	private OrderSpi orderSpi;

	@RequestMapping(value = "/order/create")
	public CommonResult<String> createOrder() {
		Random random = new Random();
		int i = random.nextInt(2);
		Order order = null;
		if (i > 0) {
			order = new Order();
		}
		return orderSpi.createOrder(order);
	}
}
