package org.example.springframework.aop;


import org.example.springframework.aop.OrderService;

import java.util.UUID;

/**
 * @author ruanwenjun
 * @create 2020/05/14/ 4:54 PM
 */
public class OrderServiceImpl implements OrderService {

	/**
	 * create order and return orderId
	 */
	public String create(int productNum) throws Exception {
		if (productNum < 0) {
			throw new RuntimeException(productNum + " productNum invalidate");
		}
		return UUID.randomUUID().toString();
	}
}
