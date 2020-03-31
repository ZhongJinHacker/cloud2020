package com.grady.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gradyjiang
 * @title: PaymentApplication9004
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/31
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication9004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication9004.class, args);
    }

}
