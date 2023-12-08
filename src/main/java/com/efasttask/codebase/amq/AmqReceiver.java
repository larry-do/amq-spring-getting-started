package com.efasttask.codebase.amq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class AmqReceiver {

    @JmsListener(destination = "${amq.queue.sample-queue-name}")
    public void messageListener(String body){
        System.out.println(body);
    }

}