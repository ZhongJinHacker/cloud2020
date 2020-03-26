package com.grady.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gradyjiang
 * @title: NacosConfigClientApplication3377
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientApplication3377 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientApplication3377.class, args);
    }

}
