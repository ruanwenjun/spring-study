package org.example.springcloud.service;

import org.example.springcloud.client.PaymentControllerClient;
import org.example.springcloud.entities.Payment;
import org.example.springcloud.entities.ResponseResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ruanwenjun
 * @create 2020/04/27/ 3:27 PM
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Resource
	private PaymentControllerClient paymentControllerClient;

	@Override
	public ResponseResult<Payment> createPayment(String serial) {
		return paymentControllerClient.createPayment(serial);
	}

	@Override
	public ResponseResult<List<Payment>> getAllPayments() {
		return paymentControllerClient.getAllPayments();
	}
}
