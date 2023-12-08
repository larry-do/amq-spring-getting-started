package com.efasttask.codebase.handler;

import com.efasttask.codebase.amq.AmqSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AmqHandler {
    @Autowired
    private AmqSender amqSender;

    @Value("${amq.queue.sample-queue-name}")
    private String sampleQueueName;

    @Scheduled(fixedDelay = 1000L * 4)
    public void sendAMQ() {
        amqSender.sendQueue(sampleQueueName, "HAHA");
        System.out.println("Sent AMQ Message");
    }
}
