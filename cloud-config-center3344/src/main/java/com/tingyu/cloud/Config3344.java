package com.tingyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/11/10 18:52
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class Config3344 {

    public static void main(String[] args) {
        SpringApplication.run(Config3344.class, args);
    }

}
