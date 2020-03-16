package com.grady.springcloud.service.hystrixfallback;

import com.grady.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author gradyjiang
 * @title: PaymentHystrixCallback
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/16
 */
@Component
public class PaymentHystrixFallback implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "---PaymentFallbackService Fallback OK";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "---PaymentFallbackService Fallback Timeout";
    }
}
