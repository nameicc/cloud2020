package com.tingyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/10/12 19:24
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ZkPayment8004 {

    public static void main(String[] args) {
        SpringApplication.run(ZkPayment8004.class, args);
    }

}
