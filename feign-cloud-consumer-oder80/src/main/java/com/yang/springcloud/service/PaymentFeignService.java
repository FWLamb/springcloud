package com.yang.springcloud.service;

import com.yang.springcloud.entities.CommonResult;
import com.yang.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Bin
 * @date 2022/6/9 13:48
 * @Description
 */
@Service
@FeignClient(value = "cloud-provider-payment")
public interface PaymentFeignService {

    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/fegin/timeout")
    String paymentFeignTimeOut();
}
