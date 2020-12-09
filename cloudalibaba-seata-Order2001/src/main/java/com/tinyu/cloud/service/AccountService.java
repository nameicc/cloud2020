package com.tinyu.cloud.service;

import com.tingyu.cloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "seata-account-service")
@Component
public interface AccountService {

    @GetMapping("/account/decrease")
    public CommonResult decreaseAccount(@RequestParam("userid") long userid, @RequestParam("consume") double consume);

}
