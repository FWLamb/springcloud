package com.yang.springcloud.controller;

import com.yang.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bin
 * @date 2022/6/12 14:44
 * @Description
 */
@RestController
public class SendMessageController {

    @Autowired
    private IMessageProvider messageProvider;

    @GetMapping("/send")
    public String send() {
        String message = messageProvider.send();
        System.out.println("message: " + message);
        return message;
    }

}
