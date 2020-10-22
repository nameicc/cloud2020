package com.tingyu.cloud.service;

import org.springframework.stereotype.Service;

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

    public String payment_timeout(long id){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程：" + Thread.currentThread().getName() + ", id：" + id + ", status is timeout";
    }

}
