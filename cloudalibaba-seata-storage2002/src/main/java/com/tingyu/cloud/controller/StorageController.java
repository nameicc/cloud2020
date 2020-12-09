package com.tingyu.cloud.controller;

import com.tingyu.cloud.entity.CommonResult;
import com.tingyu.cloud.entity.StorageEntity;
import com.tingyu.cloud.service.StorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

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

    @GetMapping("/storage/decrease")
    public CommonResult decreaseStorage(long productid, int consume){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("productid", productid);
        map.put("consume", consume);
        storageService.decrease(map);
        return new CommonResult(200, "更新成功！");
    }

}
