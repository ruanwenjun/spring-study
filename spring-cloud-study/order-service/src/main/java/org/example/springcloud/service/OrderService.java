package org.example.springcloud.service;

import org.example.springcloud.entities.Payment;
import org.example.springcloud.entities.ResponseResult;

import java.util.List;

/**
 * @author ruanwenjun
 * @create 2020/04/19/ 9:01 PM
 */
public interface OrderService {

    ResponseResult<Payment> createPayment(String serial);

    ResponseResult<List<Payment>> getAllPayments();
}
