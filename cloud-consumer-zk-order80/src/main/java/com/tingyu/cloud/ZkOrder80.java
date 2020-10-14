package com.tingyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/10/14 18:19
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ZkOrder80 {

    public static void main(String[] args) {
        SpringApplication.run(ZkOrder80.class, args);
    }

}
