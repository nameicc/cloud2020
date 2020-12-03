package com.tingyu.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.tingyu.cloud.entity.CommonResult;
import com.tingyu.cloud.entity.Payment;
import com.tingyu.cloud.handler.LimitHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/3 14:44
 **/
@RestController
public class RateLimitController {

    @GetMapping("/testLimit")
    @SentinelResource(value = "testLimit", blockHandlerClass = LimitHandler.class, blockHandler = "commonHandler2")
    public CommonResult testLimit(){
        return new CommonResult(200, "test ok", new Payment());
    }

}
