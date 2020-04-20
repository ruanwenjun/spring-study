package org.example.springcloud.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.example.springcloud.entities.Payment;
import org.example.springcloud.entities.ResponseResult;
import org.example.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ruanwenjun
 * @create 2020/04/19/ 2:35 PM
 */
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentServiceImpl;

    @PostMapping(value = "/payment/create")
    @ApiOperation("Insert payment, and return the payment ")
    public ResponseResult<Payment> createPayment(@ApiParam(name = "serial", required = true, type = "String")
                                                 @RequestParam String serial) {
        return paymentServiceImpl.createPayment(serial);
    }

    @DeleteMapping(value = "/payment/delete/{id}")
    @ApiOperation("delete payment by id, and return the delete number")
    public ResponseResult<Integer> deletePaymentById(@ApiParam(name = "id", required = true, type = "Long")
                                                     @PathVariable(value = "id") Long id) {
        return paymentServiceImpl.deletePaymentById(id);
    }

    @GetMapping(value = "/payment/get/{id}")
    @ApiOperation("query payment by id")
    ResponseResult<List<Payment>> getPaymentById(@ApiParam(name = "id", required = true, type = "Long")
                                                 @PathVariable(value = "id") Long id) {
        return paymentServiceImpl.getPaymentById(id);
    }

    @GetMapping(value = "/payment/get")
    @ApiOperation("Get all  payments")
    ResponseResult<List<Payment>> getAllPayments() {
        return paymentServiceImpl.getAllPayments();
    }

    @PutMapping(value = "/payment/update")
    @ApiOperation("update payment and return the update id")
    ResponseResult<Integer> updatePaymentById(@ApiParam(name = "payment", required = true, type = "Payment")
                                              @RequestBody Payment payment) {
        return paymentServiceImpl.updatePaymentById(payment);
    }
}
