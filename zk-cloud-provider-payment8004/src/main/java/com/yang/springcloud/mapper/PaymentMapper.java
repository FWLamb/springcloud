package com.yang.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Bin
 * @date 2022/6/7 16:37
 * @Description
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
}
