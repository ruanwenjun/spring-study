package org.example.springcloud.client;

import org.example.springcloud.entities.Payment;
import org.example.springcloud.entities.ResponseResult;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ruanwenjun
 * @create 2020/05/03/ 2:43 PM
 */
@Component
public class PaymentControllerClientFallback implements PaymentControllerClient {
	@Override
	public ResponseResult<Payment> createPayment(String serial) {

		return ResponseResult.buildResponseResult(HttpStatus.INTERNAL_SERVER_ERROR, "PaymentService is not Available ", null);
	}

	@Override
	public ResponseResult<Integer> deletePaymentById(Long id) {
		return ResponseResult.buildResponseResult(HttpStatus.INTERNAL_SERVER_ERROR, "PaymentService is not Available ", null);
	}

	@Override
	public ResponseResult<List<Payment>> getPaymentById(Long id) {
		return ResponseResult.buildResponseResult(HttpStatus.INTERNAL_SERVER_ERROR, "PaymentService is not Available ", null);
	}

	@Override
	public ResponseResult<List<Payment>> getAllPayments() {
		return ResponseResult.buildResponseResult(HttpStatus.INTERNAL_SERVER_ERROR, "PaymentService is not Available ", null);
	}

	@Override
	public ResponseResult<Integer> updatePaymentById(Payment payment) {
		return ResponseResult.buildResponseResult(HttpStatus.INTERNAL_SERVER_ERROR, "PaymentService is not Available ", null);
	}
}
