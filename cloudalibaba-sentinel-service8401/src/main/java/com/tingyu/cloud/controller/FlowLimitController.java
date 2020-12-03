package com.tingyu.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "testHotKeyHandler")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1, @RequestParam(value = "p2", required = false) String p2){
        return "hot key test....";
    }

    public String testHotKeyHandler(String p1, String p2, BlockException exception){
        return "this is hot key handler....";
    }

}
