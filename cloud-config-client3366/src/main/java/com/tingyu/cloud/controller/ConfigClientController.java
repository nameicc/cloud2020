package com.tingyu.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/11/11 18:38
 **/
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${jdbc.driverClassName}")
    private String driverClassName;

    @GetMapping("/className")
    public String getDriverClassName() {
        return driverClassName;
    }
}