package com.tingyu.cloud.controller;

import com.tingyu.cloud.entity.CommonResult;
import com.tingyu.cloud.entity.Payment;
import com.tingyu.cloud.loadbalancer.MyLoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/9/10 17:02
 **/
@RestController
@Slf4j
public class OrderController {

    // private static final String PAYMENT_URL = "http://localhost:8001";
    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private MyLoadBalancer myLoadBalancer;

    @GetMapping("consumer/payment/create")
    public CommonResult create(Payment payment){
        // 注意：Object request这个参数，需要在目标Controller用@RequestBody注解接收
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }

    @GetMapping("consumer/payment/getForEntity/{id}")
    public CommonResult getPayment2(@PathVariable("id") Long id){
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        }else{
            return new CommonResult(444, "请求错误");
        }
    }

    @GetMapping("consumer/payment/lb/{id}")
    public CommonResult getLBPayment(@PathVariable("id") Long id){
        // service信息
        List<String> servcies = discoveryClient.getServices();
        // instance信息
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        ServiceInstance instance = myLoadBalancer.getServiceInstance(instances);
        log.info("url : " + instance.getUri());
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(instance.getUri() + "/payment/get/" + id, CommonResult.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        }else{
            return new CommonResult(444, "请求错误");
        }
    }

}
