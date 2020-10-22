package com.tingyu.cloud.controller;

import com.tingyu.cloud.service.IPaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/10/22 17:58
 **/
@RestController
public class OrderController {

    @Resource
    private IPaymentService paymentService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String payment_ok(@PathVariable("id") long id){
        return paymentService.payment_ok(id);
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String payment_timeout(@PathVariable("id") long id){
        return paymentService.payment_timeout(id);
    }

}
