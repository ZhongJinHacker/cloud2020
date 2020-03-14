package com.grady.springcloud.service;

import com.grady.springcloud.entities.CommonResult;
import com.grady.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author gradyjiang
 * @title: PaymentService
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/14
 */
@Component
// 显示声明是调用那个服务，调用对方的Controller
@FeignClient(value = "cloud-payment-service")
public interface PaymentFeignService {

    // 这里和服务端的Controller 声明方式报纸一致
    @RequestMapping(value = "/payment/get/{id}", method = RequestMethod.GET)
    CommonResult getPaymenyById(@PathVariable("id")Long id);

    @GetMapping(value = "/payment/timeout")
    String paymentTimeout();
}
