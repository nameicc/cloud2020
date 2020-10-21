package com.tingyu.cloud.loadbalancer;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/10/21 15:53
 **/
@Component
public class MyLoadBalancer implements ILoadBalancer{

    private AtomicInteger num = new AtomicInteger(0);

    private int incrementAndGet(){
        int current;
        int next;
        do{
            current = num.get();
            next = current > Integer.MAX_VALUE ? 0 : current + 1;
        }while(!num.compareAndSet(current, next));
        return next;
    }

    @Override
    public ServiceInstance getServiceInstance(List<ServiceInstance> services) {
        if(services == null || services.size() <= 0){
            return null;
        }
        int index = incrementAndGet();
        return services.get(index % services.size());
    }

}
