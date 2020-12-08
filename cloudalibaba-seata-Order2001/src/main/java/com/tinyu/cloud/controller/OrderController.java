package com.tinyu.cloud.controller;

import com.tingyu.cloud.entity.CommonResult;
import com.tinyu.cloud.entity.OrderEntity;
import com.tinyu.cloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/8 16:52
 **/
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/insert")
    public CommonResult insertOrder(OrderEntity orderEntity){
        orderService.insert(orderEntity);
        return new CommonResult(200, "插入成功！");
    }

}
