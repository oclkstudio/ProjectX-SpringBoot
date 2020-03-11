package com.conceptwave.projectx.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import tr.com.turktelekom.ManageOrderProcessRequest;

@Component
public class ManageOrderProcessProducer {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${mop.queue.input}")
    private String destination;

    private static final Logger logger = LoggerFactory.getLogger(ManageOrderProcessProducer.class);

    public void send(ManageOrderProcessRequest manageOrderProcessRequest) {
        jmsTemplate.convertAndSend(destination, manageOrderProcessRequest);
        logger.info("sent message='{}'", manageOrderProcessRequest);
    }
}
