package com.tingyu.cloud.mapper;

import com.tingyu.cloud.entity.StorageEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StorageMapper {

    public long insert(StorageEntity entity);

}
