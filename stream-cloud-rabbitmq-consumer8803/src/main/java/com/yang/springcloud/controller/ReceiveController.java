package com.yang.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Controller;

/**
 * @author Bin
 * @date 2022/6/12 14:58
 * @Description
 */
@Controller
@EnableBinding(Sink.class)
public class ReceiveController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.out.println("消费者: " + serverPort + "--接受的消息：" + message.getPayload());
    }

}
