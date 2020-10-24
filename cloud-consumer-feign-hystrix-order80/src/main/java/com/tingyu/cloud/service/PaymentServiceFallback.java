package com.tingyu.cloud.service;

import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/10/24 9:37
 **/
@Component
public class PaymentServiceFallback implements IPaymentService {

    @Override
    public String payment_ok(long id) {
        return "payment service fallback: ok";
    }

    @Override
    public String payment_timeout(long id) {
        return "payment service fallback: timeout";
    }
}
