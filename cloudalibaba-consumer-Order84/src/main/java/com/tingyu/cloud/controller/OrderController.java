package com.tingyu.cloud.controller;

import com.tingyu.cloud.entity.CommonResult;
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
    public CommonResult getPayment(@PathVariable("id") String id){
        CommonResult result = restTemplate.getForObject(SERVICE_URL + "/payment/" + id, CommonResult.class);
        return result;
    }

}
