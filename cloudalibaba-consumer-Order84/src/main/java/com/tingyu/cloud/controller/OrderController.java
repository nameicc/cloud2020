package com.tingyu.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.tingyu.cloud.entity.CommonResult;
import com.tingyu.cloud.entity.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/3 16:29
 **/
@RestController
public class OrderController {

    private static final String SERVICE_URL = "http://nacos-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/{id}")
    @SentinelResource(value = "order", fallback = "payment_fallback")
    public CommonResult getPayment(@PathVariable("id") long id){
        CommonResult result = restTemplate.getForObject(SERVICE_URL + "/payment/" + id, CommonResult.class);

        if(id == 4){
            throw new IllegalArgumentException("非法的id！");
        }else if(result.getData() == null){
            throw new NullPointerException("空指针异常！");
        }

        return result;
    }

    public CommonResult payment_fallback(long id, Throwable e){
        Payment payment = new Payment(id, "");
        return new CommonResult(444, "fallback handler, exception is " + e.getMessage(), payment);
    }

}
