package org.example.springcloud.client;

import org.example.springcloud.entities.Payment;
import org.example.springcloud.entities.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ruanwenjun
 * @create 2020/04/27/ 3:22 PM
 */
@FeignClient(value = "PAYMENT-SERVICE", fallback = PaymentControllerClientFallback.class)
public interface PaymentControllerClient {


	@RequestMapping(method = RequestMethod.POST, value = "/payment/create")
	ResponseResult<Payment> createPayment(@RequestParam(value = "serial") String serial);

	@RequestMapping(method = RequestMethod.DELETE, value = "/payment/delete/{id}")
	ResponseResult<Integer> deletePaymentById(@PathVariable(value = "id") Long id);

	@RequestMapping(method = RequestMethod.GET, value = "/payment/get/{id}")
	ResponseResult<List<Payment>> getPaymentById(@PathVariable(value = "id") Long id);

	@RequestMapping(method = RequestMethod.GET, value = "/payment/get")
	ResponseResult<List<Payment>> getAllPayments();

	@RequestMapping(method = RequestMethod.HEAD, value = "/payment/update")
	ResponseResult<Integer> updatePaymentById(@RequestBody Payment payment);

}
