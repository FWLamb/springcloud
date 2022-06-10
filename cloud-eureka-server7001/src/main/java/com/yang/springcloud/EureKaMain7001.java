package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Bin
 * @date 2022/6/7 22:30
 * @Description
 */
@SpringBootApplication
@EnableEurekaServer
public class EureKaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EureKaMain7001.class, args);
    }
}
