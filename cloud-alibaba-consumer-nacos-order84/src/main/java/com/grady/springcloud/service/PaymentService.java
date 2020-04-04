package com.grady.springcloud.service;

import com.grady.springcloud.entities.CommonResult;
import com.grady.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author gradyjiang
 * @title: PaymentService
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/4/4
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentServiceFallback.class)
public interface PaymentService {

    @GetMapping("/paymentSQL/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
