package com.grady.springcloud.alibaba.service;

import com.grady.springcloud.alibaba.domain.Order;

/**
 * @author gradyjiang
 * @title: OrderService
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/4/11
 */

public interface OrderService {
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}
