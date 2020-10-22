package com.tingyu.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface IPaymentService {

    @GetMapping("/payment/hystrix/ok/{id}")
    public String payment_ok(@PathVariable("id") long id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String payment_timeout(@PathVariable("id") long id);

}
