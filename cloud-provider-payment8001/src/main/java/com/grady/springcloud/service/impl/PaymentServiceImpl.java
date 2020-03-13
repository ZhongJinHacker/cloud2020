package com.grady.springcloud.service.impl;

import com.grady.springcloud.entities.Payment;
import com.grady.springcloud.mapper.PaymentMapper;
import com.grady.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gradyjiang
 * @title: PaymentServiceImpl
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/13
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
