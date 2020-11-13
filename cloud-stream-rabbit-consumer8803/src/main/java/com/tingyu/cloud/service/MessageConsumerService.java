package com.tingyu.cloud.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/11/13 19:51
 **/
@Component
@EnableBinding(Sink.class)
public class MessageConsumerService {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void getMessage(Message<String> message){
        System.out.println("消费者" + serverPort + " receive : " + message.getPayload());
    }


}