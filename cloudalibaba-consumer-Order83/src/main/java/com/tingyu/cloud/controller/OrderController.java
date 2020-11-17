package com.tingyu.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/11/17 17:57
 **/
@RestController
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url}")
    private String SERVICE_URL;

    @GetMapping("/consumer/nacos/payment/{id}")
    public String getSreverPort(@PathVariable("id") long id){
        return restTemplate.getForObject(SERVICE_URL+"/nacos/payment/"+id, String.class);
    }

}
