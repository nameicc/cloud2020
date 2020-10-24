package com.tingyu.cloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/10/21 19:49
 **/
@Service
public class PaymentService {

    public String payment_ok(long id){
        return "线程：" + Thread.currentThread().getName() + ", id：" + id + ", status is ok";
    }

    @HystrixCommand(fallbackMethod = "timeOutFallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value="5000")
    })
    public String payment_timeout(long id){
        // int a = 10 / 0;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程：" + Thread.currentThread().getName() + ", id：" + id + ", status is timeout";
    }

    public String timeOutFallback(@PathVariable("id") long id){
        return "payment service timeout fallback";
    }



    /*****************服务熔断**********************/
    @HystrixCommand(fallbackMethod = "paymentCircuitBreakerFallback", commandProperties = {
            // 开启熔断器
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            // 设置在一个窗口期中，打开断路器的最少请求数。
            // 如果值是20，在一个窗口内（比如10秒），收到19个请求，即使这19个请求都失败了，断路器也不会打开。
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            // 熔断多久以后开始尝试是否恢复
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
            // 出错百分比阈值，当达到此阈值后，开始熔断
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")
    })
    public String paymentCircuitBreaker(long id){
        if(id < 0){
            throw new RuntimeException("*****************id不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "\t"+"调用成功，流水号：" + serialNumber;
    }

    public String paymentCircuitBreakerFallback(long id){
        return "id不能为负数！当前id：" + id;
    }

}
