package com.tingyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/10/15 18:40
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulOrder80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulOrder80.class, args);
    }

}
