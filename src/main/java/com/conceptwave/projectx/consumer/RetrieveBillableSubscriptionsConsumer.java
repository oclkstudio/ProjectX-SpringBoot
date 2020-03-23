package com.conceptwave.projectx.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import tr.com.turktelekom.RetrieveBillableSubscriptionsResponse;

@Component
public class RetrieveBillableSubscriptionsConsumer {
    private static final Logger logger = LoggerFactory.getLogger(RetrieveBillableSubscriptionsConsumer.class);
    private boolean received = true;
    private RetrieveBillableSubscriptionsResponse retrieveBillableSubscriptionsResponse;

    @JmsListener(destination = "${rbs.queue.output}")
    public void listener(RetrieveBillableSubscriptionsResponse retrieveBillableSubscriptionsResponse) {
        if(retrieveBillableSubscriptionsResponse != null) {
            this.received = false;
            this.retrieveBillableSubscriptionsResponse = retrieveBillableSubscriptionsResponse;
        }
    }

    public RetrieveBillableSubscriptionsResponse receive() {
        while(this.received) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        logger.info("received message='{}'", this.retrieveBillableSubscriptionsResponse.toString());
        this.received = true;
        return this.retrieveBillableSubscriptionsResponse;
    }
}
