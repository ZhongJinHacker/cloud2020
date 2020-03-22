package com.grady.springcloud.controller;

import com.grady.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gradyjiang
 * @title: SendMessageController
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/22
 */
@RestController
public class SendMessageController {

    @Autowired
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage(){
        return messageProvider.send();
    }

}

