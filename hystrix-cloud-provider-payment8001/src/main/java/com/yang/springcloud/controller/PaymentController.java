package com.yang.springcloud.controller;

import com.yang.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bin
 * @date 2022/6/7 16:49
 * @Description
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/ok/{id}")
    public String OkPayment(@PathVariable("id") Integer id) {
        log.info(serverPort);
        return paymentService.OkPayment(id);
    }

    @GetMapping("/payment/fail/{id}")
    public String FailPayment(@PathVariable("id") Integer id) {
        log.info(serverPort);
        return paymentService.FailPayment(id);
    }

    // 服务熔断
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        String result = paymentService.paymentCircuitBreaker(id);
        log.info("result: " + result);
        return result;
    }

}
