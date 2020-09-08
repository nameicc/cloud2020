package com.tingyu.cloud.service.impl;

import com.tingyu.cloud.dao.PaymentDao;
import com.tingyu.cloud.entity.Payment;
import com.tingyu.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/9/8 18:39
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
