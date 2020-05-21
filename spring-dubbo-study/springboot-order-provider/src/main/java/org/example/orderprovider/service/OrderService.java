package org.example.orderprovider.service;

import org.example.orderspi.bean.CommonResult;
import org.example.orderspi.bean.Order;
import org.example.orderspi.bean.ResponseCode;
import org.example.orderspi.orderspi.OrderSpi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * @author ruanwenjun
 * @create 2020/05/21/ 9:36 PM
 */
@org.apache.dubbo.config.annotation.Service
@org.springframework.stereotype.Service
public class OrderService implements OrderSpi {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public CommonResult<String> createOrder(Order order) {
		logger.info("Begin create order :" + order);

		if (order == null) {
			return new CommonResult<>(ResponseCode.BAD_REQUEST, null, "order can not be null");
		}
		String orderId = UUID.randomUUID().toString();
		return new CommonResult<>(ResponseCode.SUCCESS, orderId, "create order success");
	}
}
