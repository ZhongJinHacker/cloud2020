package com.grady.springcloud.mqlistener;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author gradyjiang
 * @title: ReceiveMessageListenerController
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/22
 */
@Component
// 标志这是一个接受者
@EnableBinding(Sink.class)
public class ReceiveMessageListener {

    @Value("${server.port}")
    private String serverPort;

    // 定义流监听者，用于接受消息
    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("消费者【2】号，----->接收到的消息："+ message.getPayload() +"\t port:" + serverPort);
    }

}
