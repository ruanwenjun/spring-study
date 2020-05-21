package org.example.orderprovider.orderservice;

import org.apache.dubbo.config.annotation.Service;
import org.example.orderspi.bean.CommonResult;
import org.example.orderspi.bean.Order;
import org.example.orderspi.bean.ResponseCode;
import org.example.orderspi.orderspi.OrderSpi;

/**
 * @author ruanwenjun
 * @create 2020/05/18/ 7:46 PM
 */
@Service
public class OrderService implements OrderSpi {

	@Override
	public CommonResult<String> createOrder(Order order) {
		if (order == null || order.getProductList() == null) {
			return new CommonResult<>(ResponseCode.BAD_REQUEST, null, "order can not be null");
		}
		return new CommonResult<>(ResponseCode.SUCCESS, null, "create order success");
	}
}
