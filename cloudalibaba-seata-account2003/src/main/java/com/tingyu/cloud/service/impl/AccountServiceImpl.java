package com.tingyu.cloud.service.impl;

import com.tingyu.cloud.entity.AccountEntity;
import com.tingyu.cloud.mapper.AccountMapper;
import com.tingyu.cloud.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/8 17:40
 **/
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public long insert(AccountEntity entity) {
        return accountMapper.insert(entity);
    }
}
