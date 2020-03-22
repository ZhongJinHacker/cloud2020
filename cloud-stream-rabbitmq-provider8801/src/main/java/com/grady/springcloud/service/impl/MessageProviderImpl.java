package com.grady.springcloud.service.impl;

import com.grady.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import java.util.UUID;

/**
 * @author gradyjiang
 * @title: MessageProviderImpl
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/22
 */

// 定义生产者消息推送管道的bean， Source.class 表示是推送者
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {

    @Autowired
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("serial = " + serial);
        return serial;
    }
}
