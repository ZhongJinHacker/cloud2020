package com.grady.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author gradyjiang
 * @title: OrderOpenFeignMain80
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/14
 */
@SpringBootApplication
@EnableFeignClients
public class OrderOpenFeignMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignMain80.class, args);
    }
}
