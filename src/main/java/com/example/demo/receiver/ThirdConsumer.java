package com.example.demo.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
//public class ThirdConsumer {
//    @RabbitListener(queues = {"first-queue","second-queue"}, containerFactory = "rabbitListenerContainerFactory")
//    public void handleMessage(String message) throws Exception {
//        // 处理消息
//        //System.out.println("ThirdConsumer:"+message);
//    }
//}
