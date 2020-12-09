package com.tingyu.cloud.service;

import com.tingyu.cloud.entity.AccountEntity;

import java.util.Map;

public interface AccountService {

    public long insert(AccountEntity entity);

    public long decrease(Map<String, Object> map);

}
