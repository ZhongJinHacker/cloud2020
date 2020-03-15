package com.grady.springcloud.controller;

import com.grady.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gradyjiang
 * @title: PaymentController
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/15
 */
@Slf4j
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    /**
     * 正常
     * @param id
     * @return
     */
    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable Integer id) {
        String result = paymentService.paymentInfo_OK(id);
        log.info("***************" + result);

        return result;
    }

    /**
     * 超时
     * @param id
     * @return
     */
    @GetMapping(value = "/payment/hystrix/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable Integer id) {
        String result = paymentService.paymentInfo_Timeout(id);
        log.info("***************" + result);

        return result;
    }
}
