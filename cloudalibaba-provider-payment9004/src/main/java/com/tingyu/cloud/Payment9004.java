package com.tingyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/3 16:20
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9004 {

    public static void main(String[] args) {
        SpringApplication.run(Payment9004.class, args);
    }

}
