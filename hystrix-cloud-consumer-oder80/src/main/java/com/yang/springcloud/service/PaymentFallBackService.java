package com.yang.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @author Bin
 * @date 2022/6/9 17:25
 * @Description
 */
@Service
public class PaymentFallBackService implements PaymentHystrixService {
    @Override
    public String OkPayment(Integer id) {
        return "OkPayment---->fallback";
    }

    @Override
    public String FailPayment(Integer id) {
        return "FailPayment---->fallback";
    }
}
