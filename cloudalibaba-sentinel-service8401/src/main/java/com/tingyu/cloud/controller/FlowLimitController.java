package com.tingyu.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/11/26 21:01
 **/
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        return "testA.........";
    }

    @GetMapping("/testB")
    public String testB(){
        return "testB.........";
    }

}
