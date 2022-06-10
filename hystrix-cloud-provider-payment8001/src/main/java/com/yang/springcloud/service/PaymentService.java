package com.yang.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Bin
 * @date 2022/6/7 16:40
 * @Description
 */
public interface PaymentService {
    String OkPayment(Integer id);

    String FailPayment(Integer id);

    String paymentCircuitBreaker(@PathVariable("id") Integer id);
}
