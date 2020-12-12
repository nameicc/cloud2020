package com.tinyu.cloud;

import com.tinyu.cloud.config.DataSourceProxyConfig;
import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/8 16:37
 **/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@MapperScan(basePackages = "com.tingyu.cloud.mapper")
@EnableFeignClients
// 导入自定义数据源配置，使用seata代理
@Import({DataSourceProxyConfig.class})
public class SeataOrder2001 {

    public static void main(String[] args) {
        SpringApplication.run(SeataOrder2001.class, args);
    }

}
