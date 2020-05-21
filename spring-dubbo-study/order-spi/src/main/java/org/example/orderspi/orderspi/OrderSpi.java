package org.example.orderspi.orderspi;

import org.example.orderspi.bean.CommonResult;
import org.example.orderspi.bean.Order;

/**
 * @author ruanwenjun
 * @create 2020/05/18/ 7:21 PM
 */
public interface OrderSpi {

	CommonResult<String> createOrder(Order order);
}
