package com.grady.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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


    // =========== 服务降级

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

    // ========= 服务熔断

    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),                   // 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),      // 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "1000"), // 时间窗口
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")     // 失败率多少次跳闸
    })
    public String paymentCircuitBreaker(@PathVariable("id")Integer id) {
        if(id < 0) {
            throw new RuntimeException("id不能是负数！");
        }

        String serial = IdUtil.simpleUUID();

        return Thread.currentThread().getName() + "\t" + "调用成功，流水号：" + serial;
    }

    public String paymentCircuitBreaker_fallback(@PathVariable("id")Integer id) {
        return "CircuitBreaker 服务熔断，请稍后再试~~~ " + id;
    }
}
