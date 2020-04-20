package org.example.springcloud.service;

import org.example.springcloud.dao.PaymentDao;
import org.example.springcloud.entities.Payment;
import org.example.springcloud.entities.ResponseResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ruanwenjun
 * @create 2020/04/19/ 1:08 PM
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public ResponseResult<Payment> createPayment(String serial) {
        Payment payment = new Payment(null, serial);
        long id = paymentDao.createPayment(payment);
        return ResponseResult.buildSuccessResult(payment);
    }

    @Override
    public ResponseResult<Integer> deletePaymentById(Long id) {
        int deleteNum = paymentDao.deletePaymentById(id);
        return ResponseResult.buildSuccessResult(deleteNum);
    }

    @Override
    public ResponseResult<List<Payment>> getPaymentById(Long id) {
        List<Payment> paymentList = paymentDao.getPaymentById(id);
        return ResponseResult.buildSuccessResult(paymentList);
    }

    @Override
    public ResponseResult<List<Payment>> getAllPayments() {
        List<Payment> allPayments = paymentDao.getAllPayments();
        return ResponseResult.buildSuccessResult(allPayments);
    }

    @Override
    public ResponseResult<Integer> updatePaymentById(Payment payment) {
        int updateNum = paymentDao.updatePaymentById(payment);
        return ResponseResult.buildSuccessResult(updateNum);
    }
}
