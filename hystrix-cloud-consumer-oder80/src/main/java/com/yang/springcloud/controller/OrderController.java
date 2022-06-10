package com.yang.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yang.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
@DefaultProperties(defaultFallback = "GlobalFallBackHandler") // 全局fallback
public class OrderController {

    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/ok/{id}")
    public String OkPayment(@PathVariable("id") Integer id) {
        return paymentHystrixService.OkPayment(id);
    }

    @GetMapping("/consumer/payment/fail/{id}")
    @HystrixCommand // 使用全局fallback
    //@HystrixCommand(fallbackMethod = "FailPaymentHandler", commandProperties =
    //        {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")})
    public String FailPayment(@PathVariable("id") Integer id) {
        // openfeign-ribbon，客户端默认等待1秒
        return paymentHystrixService.FailPayment(id);
    }

    public String FailPaymentHandler(Integer id) {
        return "线程池： " + Thread.currentThread().getName() + id + "<--80-->系统繁忙，请稍后再试！";
    }

    // 下面是全局fallback处理方法
    public String GlobalFallBackHandler() {
        return "遇到我算你倒霉！";
    }
}


