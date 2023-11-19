package com.example.controller;

import com.example.producer.RabbitMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private RabbitMQProducer rabbitMQProducer;

    @PostMapping("/send-message")
    public String sendMessage(@RequestBody String message) {
        rabbitMQProducer.send(message, "my-routing-key");
        return "Message sent to RabbitMQ: " + message;
    }
}
