package com.tingyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/10/22 17:52
 **/
@SpringBootApplication
@EnableFeignClients
public class HystrixOrder80 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixOrder80.class, args);
    }

}
