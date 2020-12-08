package com.tinyu.cloud.service.impl;

import com.tinyu.cloud.entity.OrderEntity;
import com.tinyu.cloud.mapper.OrderMapper;
import com.tinyu.cloud.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/8 16:51
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public long insert(OrderEntity entity) {
        return orderMapper.insert(entity);
    }

}
