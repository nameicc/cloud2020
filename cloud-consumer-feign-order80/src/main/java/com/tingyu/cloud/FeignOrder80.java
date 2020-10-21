package com.tingyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/10/21 16:54
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignOrder80 {

    public static void main(String[] args) {
        SpringApplication.run(FeignOrder80.class, args);
    }

}
