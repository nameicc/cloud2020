package com.tingyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/10/21 19:48
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class HystrixPayment8001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixPayment8001.class, args);
    }

}
