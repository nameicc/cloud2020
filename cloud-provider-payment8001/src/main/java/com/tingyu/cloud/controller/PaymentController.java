package com.tingyu.cloud.controller;

import com.tingyu.cloud.entity.CommonResult;
import com.tingyu.cloud.entity.Payment;
import com.tingyu.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/9/8 18:42
 **/
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    // 注意：@RequestBody注解的作用是接收来自Rest调用的Request Object
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        // 该方式获取的是受影响的行数，并非是自增主键
        log.info("受影响行数：" + result);
        // 该方式获取的是自增主键
        log.info("新增结果：" + payment.getId());
        if(result > 0){
            return new CommonResult(200, "新增成功！服务端口号为：" + serverPort, result);
        }
        return new CommonResult(405, "新增失败！");
    }

    @GetMapping("payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果：" + payment);
        if(payment != null){
            return new CommonResult(200, "查询成功！服务端口号为：" + serverPort, payment);
        }
        return new CommonResult(405, "查询失败，id为：" + id);
    }

    @GetMapping("/payment/discovery")
    public Object discovery(){
        // service信息
        List<String> servcies = discoveryClient.getServices();
        for(String service : servcies){
            log.info("service: " + service);
        }
        // instance信息
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for(ServiceInstance instance : instances){
            log.info(instance.getServiceId() + "\t" + instance.getInstanceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }
        return discoveryClient;
    }

}
