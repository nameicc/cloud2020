package com.tingyu.cloud.mapper;

import com.tingyu.cloud.entity.AccountEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/8 17:38
 **/
@Mapper
public interface AccountMapper {

    public long insert(AccountEntity entity);

}
