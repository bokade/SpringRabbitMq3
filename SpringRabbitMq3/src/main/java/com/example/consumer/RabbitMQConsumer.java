package com.example.consumer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer
{
    //@RabbitListener(queues = "your-queue-name")
    @RabbitListener(queues = "my-queue")
    public void receiveMessage(String message)
    {
        System.out.println("Received message: " + message);
        // Add your message processing logic here
    }
}

