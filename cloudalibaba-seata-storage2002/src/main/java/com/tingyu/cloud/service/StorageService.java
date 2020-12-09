package com.tingyu.cloud.service;

import com.tingyu.cloud.entity.StorageEntity;

import java.util.Map;

public interface StorageService {

    public long insert(StorageEntity entity);

    public long decrease(Map<String, Object> map);

}
