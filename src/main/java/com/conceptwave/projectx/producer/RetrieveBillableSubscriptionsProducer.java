package com.conceptwave.projectx.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import tr.com.turktelekom.RetrieveBillableSubscriptionsRequest;

@Component
public class RetrieveBillableSubscriptionsProducer {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${rbs.queue.input}")
    private String destination;

    private static final Logger logger = LoggerFactory.getLogger(ManageOrderProcessProducer.class);

    public void send(RetrieveBillableSubscriptionsRequest retrieveBillableSubscriptionsRequest) {
        jmsTemplate.convertAndSend(destination, retrieveBillableSubscriptionsRequest);
        logger.info("sent message='{}'", retrieveBillableSubscriptionsRequest);
    }
}
