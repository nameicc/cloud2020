package com.tingyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/3 16:27
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Order84 {

    public static void main(String[] args) {
        SpringApplication.run(Order84.class, args);
    }

}
