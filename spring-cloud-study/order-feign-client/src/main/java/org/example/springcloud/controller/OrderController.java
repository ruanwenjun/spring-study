package org.example.springcloud.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.example.springcloud.entities.Payment;
import org.example.springcloud.entities.ResponseResult;
import org.example.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ruanwenjun
 * @create 2020/04/27/ 3:26 PM
 */
@RestController
public class OrderController {

	@Resource
	private OrderService orderService;

	@PostMapping(value = "/order/create")
	@ApiOperation("Create payment")
	public ResponseResult<Payment> createPayment(@ApiParam(name = "serial", required = true, type = "String")
	                                             @RequestParam String serial) {
		return orderService.createPayment(serial);
	}

	@ApiOperation("Get all payments")
	@GetMapping(value = "order/get")
	public ResponseResult<List<Payment>> getAllPayments() {
		return orderService.getAllPayments();
	}
}
