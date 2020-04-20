package org.example.springcloud.dao;

import org.example.springcloud.BaseTest;
import org.example.springcloud.entities.Payment;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author ruanwenjun
 * @create 2020/04/19/ 12:55 PM
 */
public class PaymentDaoTest implements BaseTest {

    @Autowired
    private PaymentDao paymentDao;

    @Test
    @Ignore
    public void createPayment() {
        long serial = paymentDao.createPayment(new Payment(null, "serial"));
        Assert.assertEquals(1, serial);
    }

    @Test
    @Ignore
    public void deletePaymentById() {
        paymentDao.deletePaymentById(1L);
    }

    @Test
    @Ignore
    public void getPaymentById() {
        Long id = 1L;
        List<Payment> paymentById = paymentDao.getPaymentById(id);
        Assert.assertEquals(paymentById.get(0).getSerial(), "test");
    }

    @Test
    @Ignore
    public void updatePaymentById() {
        Payment payment = new Payment(2L, "testUpdate");
        int i = paymentDao.updatePaymentById(payment);
        Assert.assertEquals(i, 1);
    }
}