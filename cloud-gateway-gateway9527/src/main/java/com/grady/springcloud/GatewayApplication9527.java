package com.grady.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author gradyjiang
 * @title: GatewayApplication9527
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/22
 */

@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication9527 {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication9527.class, args);
    }

}
