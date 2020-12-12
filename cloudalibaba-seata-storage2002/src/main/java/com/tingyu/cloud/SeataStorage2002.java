package com.tingyu.cloud;


import com.tingyu.cloud.config.DataSourceProxyConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/8 17:17
 **/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@MapperScan(basePackages = "com.tingyu.cloud.mapper")
// 导入自定义数据源配置，使用seata代理
@Import({DataSourceProxyConfig.class})
public class SeataStorage2002 {

    public static void main(String[] args) {
        SpringApplication.run(SeataStorage2002.class, args);
    }

}
