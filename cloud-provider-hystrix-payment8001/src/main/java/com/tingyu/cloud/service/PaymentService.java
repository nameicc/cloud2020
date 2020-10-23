package com.tingyu.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
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

}
