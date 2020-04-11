package com.grady.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author gradyjiang
 * @title: SeataOrderApplication2001
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/4/11
 */
@EnableDiscoveryClient
@EnableFeignClients
//取消数据源自动创造 , 使用mybatisConfig 整合seata进行管理
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SeataOrderApplication2001 {

    public static void main(String[] args) {
        SpringApplication.run(SeataOrderApplication2001.class, args);
    }

}
