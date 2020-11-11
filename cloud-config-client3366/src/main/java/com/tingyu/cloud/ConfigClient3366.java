package com.tingyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/11/11 18:36
 **/
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient3366 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient3366.class, args);
    }

}
