package com.tinyu.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/8 16:37
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.tingyu.cloud.mapper")
@EnableFeignClients
public class SeataOrder2001 {

    public static void main(String[] args) {
        SpringApplication.run(SeataOrder2001.class, args);
    }

}
