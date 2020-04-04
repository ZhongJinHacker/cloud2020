package com.grady.springcloud.service;

import com.grady.springcloud.entities.CommonResult;
import com.grady.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author gradyjiang
 * @title: PaymentFallbackService
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/4/4
 */
@Component
public class PaymentServiceFallback implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44449, "服务降级 ---- PaymentServiceFallback",
                new Payment(id, "error serial"));
    }

}
