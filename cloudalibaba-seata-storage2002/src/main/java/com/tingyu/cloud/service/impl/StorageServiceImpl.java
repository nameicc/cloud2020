package com.tingyu.cloud.service.impl;

import com.tingyu.cloud.entity.StorageEntity;
import com.tingyu.cloud.mapper.StorageMapper;
import com.tingyu.cloud.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/8 17:22
 **/
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageMapper storageMapper;

    @Override
    public long insert(StorageEntity entity) {
        return storageMapper.insert(entity);
    }

    @Override
    public long decrease(Map<String, Object> map) {
        return storageMapper.decrease(map);
    }

}
