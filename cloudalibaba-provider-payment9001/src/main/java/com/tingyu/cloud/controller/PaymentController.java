package com.tingyu.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/11/17 17:13
 **/
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/nacos/payment/{id}")
    public String getPort(@PathVariable("id") long id){
        return "Server port is : " + serverPort + ", and id = " + id;
    }

}
