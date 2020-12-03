package com.tingyu.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/11/26 21:01
 **/
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        /*try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "testA.........";
    }

    @GetMapping("/testB")
    public String testB(){
        log.info(Thread.currentThread().getName() + "....testB");
        return "testB.........";
    }

    @GetMapping("/testC")
    public String testC(){
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("testC......");
        return "testC.........";
    }

    @GetMapping("/testD")
    public String testD(){
        int a = 10 / 0;
        return "testD.........";
    }

    @GetMapping("/testE")
    public String testE(){
        int a = 10 / 0;
        return "testE.........";
    }

}
