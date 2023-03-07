package com.xoriant.controller;

import com.xoriant.Util.JaksonUtil;
import com.xoriant.model.Product;
import com.xoriant.service.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class MessageController {

    @Autowired
    private Producer messageProducer;

    @Autowired
    private JaksonUtil jaksonUtil;

    public MessageController(Producer messageProducer, JaksonUtil jaksonUtil) {
        this.messageProducer = messageProducer;
        this.jaksonUtil = jaksonUtil;
    }


    @Scheduled(cron = "10 * * * * *")
    public void send() {

        Product product=new Product(58623,"Reddy","JKI89#LOP",29999.9,"Benglore",new Date());
        String json=jaksonUtil.toJson(product);

        messageProducer.send(json);
        System.out.println(product+":::::"+json);

    }

//    @Autowired
//    private Producer messageProducer;
//
//    public MessageController(Producer messageProducer) {
//        this.messageProducer = messageProducer;
//    }

//    @PostMapping("/messages")
//    public void sendMessage(@RequestBody String message) {
//        messageProducer.send(message);
//    }
}

