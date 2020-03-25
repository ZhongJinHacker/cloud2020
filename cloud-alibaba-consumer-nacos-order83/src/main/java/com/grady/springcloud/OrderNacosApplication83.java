package com.grady.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gradyjiang
 * @title: OrderNacosApplication83
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/25
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosApplication83 {

    public static void main(String[] args) {
        SpringApplication.run(OrderNacosApplication83.class, args);
    }

}
