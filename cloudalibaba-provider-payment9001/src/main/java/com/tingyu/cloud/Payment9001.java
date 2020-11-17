package com.tingyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/11/17 17:12
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9001 {

    public static void main(String[] args) {
        SpringApplication.run(Payment9001.class, args);
    }

}
