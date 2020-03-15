package com.grady.springcloud.controller;

import com.grady.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gradyjiang
 * @title: OrderHystrixController
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/15
 */
@RestController
@Slf4j
public class OrderHystrixController {

    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable(value = "id") Integer id) {
        String result = paymentHystrixService.paymentInfo_OK(id);
        return result;
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    })
    @GetMapping(value = "/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable(value = "id") Integer id) {
        String result = paymentHystrixService.paymentInfo_Timeout(id);

        return result;
    }

    // 超时或出错 回调函数
    public String paymentInfo_TimeoutHandler(@PathVariable(value = "id") Integer id) {
        return "我是消费者80，8001服务繁忙或错误或80自己运行超时或错误！" + id;
    }
}
