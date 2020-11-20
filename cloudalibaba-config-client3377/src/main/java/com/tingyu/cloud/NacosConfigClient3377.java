package com.tingyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/11/20 18:26
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClient3377 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClient3377.class, args);
    }

}
