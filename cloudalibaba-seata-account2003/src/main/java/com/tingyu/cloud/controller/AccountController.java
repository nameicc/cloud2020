package com.tingyu.cloud.controller;

import com.tingyu.cloud.entity.AccountEntity;
import com.tingyu.cloud.entity.CommonResult;
import com.tingyu.cloud.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/8 17:42
 **/
@RestController
public class AccountController {

    @Resource
    private AccountService accountService;

    @GetMapping("/account/insert")
    public CommonResult insertAccount(AccountEntity entity){
        accountService.insert(entity);
        return new CommonResult(200, "插入成功！");
    }

    @GetMapping("/account/decrease")
    public CommonResult decreaseAccount(long userid, double consume){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userid", userid);
        map.put("consume", consume);
        int a = 10 / 0;
        accountService.decrease(map);
        return new CommonResult(200, "更新成功！");
    }

}
