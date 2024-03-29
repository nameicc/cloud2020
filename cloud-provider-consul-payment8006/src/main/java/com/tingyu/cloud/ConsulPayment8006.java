package com.tingyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/10/15 18:31
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulPayment8006 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulPayment8006.class, args);
    }

}
