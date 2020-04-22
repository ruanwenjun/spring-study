package org.example.springcloud.service;

import org.example.springcloud.config.RestTemplateConfiguration;
import org.example.springcloud.entities.Payment;
import org.example.springcloud.entities.ResponseResult;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ruanwenjun
 * @create 2020/04/19/ 9:02 PM
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private RestTemplate restTemplate;

    @Override
    public ResponseResult<Payment> createPayment(String serial) {
        MultiValueMap<String, Object> multiValueMap = new LinkedMultiValueMap<>();
        multiValueMap.add("serial", serial);
        return restTemplate.postForObject(String.format("%s/payment/create", RestTemplateConfiguration.PAYMENT_SERVICE_NAME),
            multiValueMap, ResponseResult.class);
    }

    @Override
    public ResponseResult<List<Payment>> getAllPayments() {
        return restTemplate.getForObject(String.format("%s/payment/get", RestTemplateConfiguration.PAYMENT_SERVICE_NAME),
            ResponseResult.class);
    }
}
