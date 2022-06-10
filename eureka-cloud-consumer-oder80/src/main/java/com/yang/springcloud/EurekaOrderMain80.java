package com.yang.springcloud;

import com.yang.myribbonrule.CustomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author Bin
 * @date 2022/6/7 15:52
 * @Description
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "cloud-provider-payment", configuration = CustomRule.class)
public class EurekaOrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaOrderMain80.class, args);
    }
}
