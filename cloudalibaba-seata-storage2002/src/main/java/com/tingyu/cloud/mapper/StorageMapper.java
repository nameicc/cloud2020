package com.tingyu.cloud.mapper;

import com.tingyu.cloud.entity.StorageEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface StorageMapper {

    public long insert(StorageEntity entity);

    public long decrease(Map<String, Object> map);

}
