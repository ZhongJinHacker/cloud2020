package com.grady.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author gradyjiang
 * @title: OrderNacosApplication84
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/31
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderNacosApplication84 {

    public static void main(String[] args) {
        SpringApplication.run(OrderNacosApplication84.class, args);
    }

}
