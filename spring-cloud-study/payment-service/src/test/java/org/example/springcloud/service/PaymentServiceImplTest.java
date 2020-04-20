package org.example.springcloud.service;

import org.example.springcloud.BaseTest;
import org.example.springcloud.dao.PaymentDao;
import org.example.springcloud.entities.Payment;
import org.example.springcloud.entities.ResponseResult;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;


/**
 * @author ruanwenjun
 * @create 2020/04/19/ 2:23 PM
 */
public class PaymentServiceImplTest implements BaseTest {

    @MockBean
    private PaymentDao paymentDao;

    @Autowired
    private PaymentService paymentServiceImpl;

    @Test
    public void createPayment() {
        Mockito.when(paymentDao.createPayment(Mockito.any())).thenReturn(-1L);

        ResponseResult<Payment> responseResult = paymentServiceImpl.createPayment("testPaymentServiceCreate");
        Assert.assertNull(responseResult.getData().getId());
    }

    @Test
    public void deletePayment() {
        System.out.println("hahha");

    }

    @Test
    public void getPaymentById() {
    }

    @Test
    public void updatePaymentById() {
    }
}