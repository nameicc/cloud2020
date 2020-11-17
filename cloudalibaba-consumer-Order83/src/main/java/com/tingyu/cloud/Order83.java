package com.tingyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/11/17 17:55
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Order83 {

    public static void main(String[] args) {
        SpringApplication.run(Order83.class, args);
    }

}
