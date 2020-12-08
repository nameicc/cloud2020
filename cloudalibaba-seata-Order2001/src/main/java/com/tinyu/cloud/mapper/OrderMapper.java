package com.tinyu.cloud.mapper;

import com.tinyu.cloud.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/8 16:42
 **/
@Mapper
public interface OrderMapper {

    public long insert(OrderEntity entity);

}
