package com.tingyu.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/8 17:17
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.tingyu.cloud.mapper")
public class SeataStorage2002 {

    public static void main(String[] args) {
        SpringApplication.run(SeataStorage2002.class, args);
    }

}
