package org.example.springcloud.service;

import org.example.springcloud.entities.Payment;
import org.example.springcloud.entities.ResponseResult;

import java.util.List;

/**
 * @author ruanwenjun
 * @create 2020/04/19/ 1:06 PM
 */
public interface PaymentService {


    ResponseResult<Payment> createPayment(String serial);

    ResponseResult<Integer> deletePaymentById(Long id);

    ResponseResult<List<Payment>> getPaymentById(Long id);

    ResponseResult<List<Payment>> getAllPayments();

    ResponseResult<Integer> updatePaymentById(Payment payment);
}
