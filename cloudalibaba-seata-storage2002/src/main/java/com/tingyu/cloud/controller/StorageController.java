package com.tingyu.cloud.controller;

import com.tingyu.cloud.entity.CommonResult;
import com.tingyu.cloud.entity.StorageEntity;
import com.tingyu.cloud.service.StorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/8 17:23
 **/
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @GetMapping("/storage/insert")
    public CommonResult insertStorage(StorageEntity entity){
        storageService.insert(entity);
        return new CommonResult(200, "插入成功！");
    }

}
