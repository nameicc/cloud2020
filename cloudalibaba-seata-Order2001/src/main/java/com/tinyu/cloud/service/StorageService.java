package com.tinyu.cloud.service;

import com.tingyu.cloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "seata-storage-service")
@Component
public interface StorageService {

    @GetMapping("/storage/decrease")
    public CommonResult decreaseStorage(@RequestParam("productid") long productid, @RequestParam("consume") int consume);

}
