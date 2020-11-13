package com.tingyu.cloud.controller;

import com.tingyu.cloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/11/13 18:49
 **/
@RestController
public class MessageProviderController {

    @Resource
    public IMessageProvider messageProvider;

    @GetMapping("/send")
    public String sendMessage(){
        return messageProvider.send();
    }

}
