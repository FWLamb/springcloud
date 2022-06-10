package com.yang.springcloud.service;

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
@FeignClient(value = "hystrix-cloud-provider-payment", fallback = PaymentFallBackService.class)
public interface PaymentHystrixService {

    @GetMapping("/payment/ok/{id}")
    String OkPayment(@PathVariable("id") Integer id);

    @GetMapping("/payment/fail/{id}")
    String FailPayment(@PathVariable("id") Integer id);
}
