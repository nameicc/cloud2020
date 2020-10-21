package com.tingyu.cloud.loadbalancer;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/10/21 15:50
 **/
public interface ILoadBalancer {

    ServiceInstance getServiceInstance(List<ServiceInstance> services);

}
