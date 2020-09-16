package com.tingyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/9/10 16:38
 **/
@SpringBootApplication
@EnableEurekaClient
public class Order80 {

    public static void main(String[] args) {
        SpringApplication.run(Order80.class, args);
    }

}
