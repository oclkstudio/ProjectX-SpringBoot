package com.conceptwave.projectx.service;

import com.conceptwave.projectx.consumer.RetrieveBillableSubscriptionsConsumer;
import com.conceptwave.projectx.producer.RetrieveBillableSubscriptionsProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.turktelekom.RetrieveBillableSubscriptionsRequest;
import tr.com.turktelekom.RetrieveBillableSubscriptionsResponse;

@Service
public class RetrieveBillableSubscriptionsServiceImp implements RetrieveBillableSubscriptionsService {
    @Autowired
    private RetrieveBillableSubscriptionsProducer retrieveBillableSubscriptionsProducer;

    @Autowired
    private RetrieveBillableSubscriptionsConsumer retrieveBillableSubscriptionsConsumer;

    @Override
    public void send(RetrieveBillableSubscriptionsRequest retrieveBillableSubscriptionsRequest) {
        retrieveBillableSubscriptionsProducer.send(retrieveBillableSubscriptionsRequest);
    }

    @Override
    public RetrieveBillableSubscriptionsResponse receive() {
        return retrieveBillableSubscriptionsConsumer.receive();
    }
}
