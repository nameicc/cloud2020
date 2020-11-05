package com.tingyu.cloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/11/5 18:39
 **/
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("guonei", r ->
                        r.path("/guonei").uri("http://news.baidu.com/guonei"))
                .route("guonei", r ->
                        r.path("/sports").uri("http://news.baidu.com/sports"))
                .build();
    }


}
