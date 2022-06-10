package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Bin
 * @date 2022/6/7 15:52
 * @Description
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class EurekaPaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaPaymentMain8002.class, args);
    }
}
