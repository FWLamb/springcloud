package com.yang.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Bin
 * @date 2022/6/7 16:49
 * @Description
 */
@RestController
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL = "http://cloud-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/payment/zk")
    public String paymentZk() {
        log.info("------------------");
        return restTemplate.getForObject(PAYMENT_URL + "/payment/zk", String.class);
    }


}
