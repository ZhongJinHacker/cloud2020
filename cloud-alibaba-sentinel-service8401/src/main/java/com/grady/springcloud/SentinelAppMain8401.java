package com.grady.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gradyjiang
 * @title: SentinelAppMain8401
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/27
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelAppMain8401 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelAppMain8401.class, args);
    }
}
