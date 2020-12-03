package com.tingyu.cloud.controller;

import com.tingyu.cloud.entity.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/3 16:08
 **/
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;

    private static Map<String, String> map = new HashMap();

    static{
        map.put("1", "11111111111111111");
        map.put("2", "22222222222222222");
        map.put("3", "33333333333333333");
    }

    @GetMapping("/payment/{id}")
    public CommonResult payment(@PathVariable("id")String id){
        return new CommonResult(200, "query is ok, port is " + port, map.get(id));
    }

}
