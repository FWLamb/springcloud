package com.yang.myribbonrule;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.context.annotation.Bean;


/**
 * @author Bin
 * @date 2022/6/9 9:49
 * @Description
 */
public class CustomRule {

    @Bean
    public IRule myRule() {
        return new RetryRule();
    }
}
