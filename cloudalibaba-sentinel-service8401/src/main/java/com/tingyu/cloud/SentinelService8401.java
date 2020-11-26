package com.tingyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/11/26 21:00
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelService8401 {

    public static void main(String[] args) {
        SpringApplication.run(SentinelService8401.class, args);
    }

}
