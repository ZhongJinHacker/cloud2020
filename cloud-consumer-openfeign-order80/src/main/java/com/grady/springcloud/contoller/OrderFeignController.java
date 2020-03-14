package com.grady.springcloud.contoller;

import com.grady.springcloud.entities.CommonResult;
import com.grady.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gradyjiang
 * @title: OrderFeignController
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/14
 */
@Slf4j
@RestController
public class OrderFeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @RequestMapping(value = "/consumer/payment/get/{id}", method = RequestMethod.GET)
    public CommonResult getPaymenyById(@PathVariable("id")Long id) {

        return paymentFeignService.getPaymenyById(id);
    }

    @RequestMapping(value = "/consumer/payment/timeout", method = RequestMethod.GET)
    public String paymentTimeout() {
        return paymentFeignService.paymentTimeout();
    }
}
