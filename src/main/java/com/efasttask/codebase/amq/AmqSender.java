package com.efasttask.codebase.amq;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class AmqSender {

    private final JmsTemplate jmsTemplate;

    public AmqSender(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendQueue(final String destination, Object body) {
        jmsTemplate.convertAndSend(destination, body);
    }
}
