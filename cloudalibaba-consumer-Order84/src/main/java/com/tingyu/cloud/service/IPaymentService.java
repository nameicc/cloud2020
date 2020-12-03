package com.tingyu.cloud.service;

import com.tingyu.cloud.entity.CommonResult;
import com.tingyu.cloud.service.fallback.PaymentServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/3 17:50
 **/
@FeignClient(value = "nacos-payment-service", fallback = PaymentServiceFallback.class)
public interface IPaymentService {

    @GetMapping("/payment/{id}")
    public CommonResult getPayment(@PathVariable("id") long id);

}
