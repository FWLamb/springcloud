package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Bin
 * @date 2022/6/7 15:52
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZkPaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(ZkPaymentMain8004.class, args);
    }
}
