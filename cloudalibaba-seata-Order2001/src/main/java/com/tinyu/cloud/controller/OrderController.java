package com.tinyu.cloud.controller;

import com.tingyu.cloud.entity.CommonResult;
import com.tinyu.cloud.entity.OrderEntity;
import com.tinyu.cloud.service.AccountService;
import com.tinyu.cloud.service.OrderService;
import com.tinyu.cloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/8 16:52
 **/
@RestController
@Slf4j
public class OrderController {

    @Resource
    private OrderService orderService;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    @GlobalTransactional(name = "create-order", rollbackFor = Exception.class)
    @GetMapping("/order/insert")
    public CommonResult insertOrder(OrderEntity orderEntity){
        // 添加订单
        log.info("添加订单.............");
        orderService.insert(orderEntity);
        // 修改库存
        log.info("修改库存.............");
        storageService.decreaseStorage(orderEntity.getProductid(), orderEntity.getAmount());
        // 修改账户
        log.info("修改账户.............");
        accountService.decreaseAccount(orderEntity.getUserid(), orderEntity.getMoney());
        // 修改订单状态
        log.info("修改订单状态.............");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userid", orderEntity.getUserid());
        map.put("productid", orderEntity.getProductid());
        orderService.updateState(map);
        // 完成
        log.info("下单完成.............");
        return new CommonResult(200, "下单成功！");
    }

}
