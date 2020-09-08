package com.tingyu.cloud.controller;

import com.tingyu.cloud.entity.CommonResult;
import com.tingyu.cloud.entity.Payment;
import com.tingyu.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

    @PostMapping("/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        // 该方式获取的是受影响的行数，并非是自增主键
        log.info("受影响行数：" + result);
        // 该方式获取的是自增主键
        log.info("新增结果：" + payment.getId());
        if(result > 0){
            return new CommonResult(200, "新增成功！", result);
        }
        return new CommonResult(405, "新增失败！");
    }

    @GetMapping("payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果：" + payment);
        if(payment != null){
            return new CommonResult(200, "查询成功！", payment);
        }
        return new CommonResult(405, "查询失败，id为：" + id);
    }

}
