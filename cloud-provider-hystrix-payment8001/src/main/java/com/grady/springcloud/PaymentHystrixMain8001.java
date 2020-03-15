package com.grady.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author gradyjiang
 * @title: PaymenthystrixMain8001
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/15
 */
@SpringBootApplication
@EnableEurekaClient
// 启动服务降级熔断器
@EnableCircuitBreaker
public class PaymentHystrixMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8001.class, args);
    }
}
