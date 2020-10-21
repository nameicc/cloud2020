package com.tingyu.cloud.controller;

import com.tingyu.cloud.entity.CommonResult;
import com.tingyu.cloud.service.IPaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/10/21 17:03
 **/
@RestController
public class OrderController {

    @Resource
    private IPaymentService paymentService;

    @GetMapping("consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id){
        return paymentService.getPaymentById(id);
    }

}
