package com.grady.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author gradyjiang
 * @title: PaymentService
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/15
 */
@Service
public class PaymentService {

    /**
     * 正常访问，ok
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id) {
        return "线程池: " + Thread.currentThread().getName() + " PaymentInfo_OK,id: " + id + "\t" + "O(∩_∩)O哈哈~";
    }

    // 3000 表示 3秒以内是正常逻辑,超时或报错 执行 paymentInfo_TimeoutHandler 方法
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler",
            commandProperties = { @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000") })
    public String paymentInfo_Timeout(Integer id) {
        // 暂停几秒钟的线程
        // 模拟报错
        int i = 10 / 0;
        int timeout = 3;
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: " + Thread.currentThread().getName() + "PaymentInfo_Timeout,id: " + id + "\t" + "耗时" + timeout + "秒~~";
    }

    public String paymentInfo_TimeoutHandler(Integer id) {
        return "线程池: " + Thread.currentThread().getName() + "8001系统忙或报错,稍后再试,idL " + id + "\t" + "o(╥﹏╥)o";
    }
}
