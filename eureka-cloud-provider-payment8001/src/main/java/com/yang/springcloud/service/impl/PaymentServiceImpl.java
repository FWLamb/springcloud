package com.yang.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yang.springcloud.entities.Payment;
import com.yang.springcloud.mapper.PaymentMapper;
import com.yang.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @author Bin
 * @date 2022/6/7 16:40
 * @Description
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {
}
