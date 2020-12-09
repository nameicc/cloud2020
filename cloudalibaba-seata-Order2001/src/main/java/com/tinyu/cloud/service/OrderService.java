package com.tinyu.cloud.service;

import com.tinyu.cloud.entity.OrderEntity;

import java.util.Map;

public interface OrderService {

    public long insert(OrderEntity entity);

    public void updateState(Map<String, Object> map);

}
