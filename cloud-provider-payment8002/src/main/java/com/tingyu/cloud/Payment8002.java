package com.tingyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description:
 * @Author: tingyu
 * @Date: 2020-09-04 17:26
 */
@SpringBootApplication
@EnableEurekaClient
public class Payment8002 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8002.class, args);
    }
}
