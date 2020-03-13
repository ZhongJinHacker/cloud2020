package com.grady.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author gradyjiang
 * @title: PaymentMain8001
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/13
 */
@EnableEurekaClient
@SpringBootApplication
public class PaymentMain8002 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
    }
}
