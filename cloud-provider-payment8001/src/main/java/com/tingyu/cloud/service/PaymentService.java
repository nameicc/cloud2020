package com.tingyu.cloud.service;

import com.tingyu.cloud.entity.Payment;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);

}
