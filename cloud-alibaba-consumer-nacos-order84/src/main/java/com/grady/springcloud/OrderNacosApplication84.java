package com.grady.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gradyjiang
 * @title: OrderNacosApplication84
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/31
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosApplication84 {

    public static void main(String[] args) {
        SpringApplication.run(OrderNacosApplication84.class, args);
    }

}
