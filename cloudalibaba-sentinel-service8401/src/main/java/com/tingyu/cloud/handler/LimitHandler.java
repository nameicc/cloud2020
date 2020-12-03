package com.tingyu.cloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.tingyu.cloud.entity.CommonResult;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/3 14:46
 **/
public class LimitHandler {

    public static CommonResult commonHandler1(BlockException ex){
        return new CommonResult(444, "common limit handler-------------1");
    }

    public static CommonResult commonHandler2(BlockException ex){
        return new CommonResult(444, "common limit handler-------------2");
    }

}
