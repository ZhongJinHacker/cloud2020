package com.grady.springcloud.alibaba.controller;

import com.grady.springcloud.alibaba.domain.CommonResult;
import com.grady.springcloud.alibaba.domain.Order;
import com.grady.springcloud.alibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gradyjiang
 * @title: OrderController
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/4/11
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单 http://localhost:2001/order/create?userId=1&productId=1&count=10&money=100
     *
     * @param order
     * @return
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
